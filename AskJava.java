public class AskJava {
    public static void main(String[] args) {
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");
                                        
        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (people <= capacity) + "\n");
                                        

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (request == purchase) + "\n");
                                        

        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (guests <= space) + "\n");
                                        

        int yourVotes = 43;
        int competitorVotes = 23;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");
                                        


    }
}