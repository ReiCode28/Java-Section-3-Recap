public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        double toyCar = 5.99;
        double nikeShoes = 95.99;
        System.out.println("\n\t Toy Car Price: " + toyCar +
                           "\n\t Nike Shoes Price: " + nikeShoes +
                           "\n\t Balance: " + wallet);
        System.out.println("\nCan I get this toy car?");
        
       if (wallet >= toyCar) {
        System.out.println("Sure!");
        wallet -= toyCar;
        System.out.println("\nBalance: " + wallet);
       } else {
        System.out.println("Sorry, I only have " + wallet + " left");
       }
       
        System.out.println("\nCan I get these nike shoes?");

        if (wallet >= nikeShoes) {
            System.out.println("Sure!");
            wallet -= nikeShoes;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left\n");
        }

    }
}