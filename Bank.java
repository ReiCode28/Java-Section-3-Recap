import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String decision = scan.nextLine();

        if (decision.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            int savings = scan.nextInt();
            int creditDebt = scan.nextInt();

            System.out.println("\nHow many years have you worked for?");
            int workYears = scan.nextInt();

            System.out.println("What is your name?");
            String name = scan.next();

            if (savings >= 10000 && creditDebt <= 5000 && workYears >= 2) {
                System.out.println("Congratulations " + name + ", you have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortage");
            }

        } else if (decision.equals("no")) {
            System.out.println("Okay, have a nice day!");
        } else if (!decision.equals("yes") || !decision.equals("no")) {
            System.out.println("invalid option");
        }

        scan.close();
    }
}

/*
 * Approves customers for a loan if they meet the following requirements:
 * Have $10,000 in their savings account
 * Have less than $5,000 in credit card debt
 * Have worked for more than 2 years
 * Reicode28
 */