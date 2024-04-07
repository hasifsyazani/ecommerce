public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setWallet(1000.00);
        user.buyItem(user.getWallet(), 500.00, 100);
        System.out.println("Remaining wallet is " + user.getWallet());
        System.out.println("Remaining points is " + user.getPoints());
    }
}
