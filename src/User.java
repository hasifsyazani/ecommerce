//import java.util.Map;
//import java.util.HashMap;

public class User {
    // Set all attributes to private
    private String name;
    private String address;
    private String contact;
    private int points;
    private double wallet;
    private int pointsPerPrice;
    //private Map<String, String> attribute;

    public User() {
        // Define constructor to initialize the attributes to null
        this.name = null;
        this.address = null;
        this.contact = null;
        this.points = 0;
        this.wallet = 0.0;
        this.pointsPerPrice = 10;
        //this.attribute = new HashMap<>();
    }

    // Define getter and setter for each attribute
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public String getContact() { return this.contact; }
    public int getPoints() { return this.points; }
    public double getWallet() { return this.wallet; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setContact(String contact) { this.contact = contact; }
    public void setPoints(int points) { this.points = points; }
    public void setWallet(double wallet) { this.wallet = wallet; }

    public void buyItem(double wallet, double price, int points) {
        double remainingWallet = wallet - price;
        setWallet(remainingWallet);
        int newPoints = points + (int)(price/this.pointsPerPrice);
        setPoints(newPoints);
    }

    //public void addAttribute(String key, String value) {
    //    this.attribute.put(key, value);
    //}

    //public String getAttribute(String key) {
    //    return this.attribute.get(key);
    //}

}
