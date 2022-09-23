//Switch Statements Practice
public class Calendar {
    public static void main(String[] args) {
        String day = "Friday"; 
        System.out.println("\nFriend: Hey, are you free on " + day + "? \n");


        System.out.println("You: Hmm, let me check my calendar.");

        switch (day){
            case "Monday": System.out.println("Sorry, I have to stay at work late.\n"); break;
            case "Tuesday": System.out.println("It looks like I have meetings all day.\n"); break;
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time!\n"); break;
            case "Thursday": System.out.println("Sorry, thursday is date night!\n"); break;
            case "Friday": System.out.println("I'm free!!\n"); break;
            case "Saturday": System.out.println("I'm free!!\n"); break;
            case "Sunday": System.out.println("I'm free!!\n"); break;
            default : System.out.println("that's not a day.\n"); break;
        }
        
        //Checks calendar to see if you are free

            //  "Monday": print ("Sorry, I have to stay at work late."); 
            //  "Tuesday": print ("It looks like I have meetings all day."); 
            //  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            //  "Thursday": print ("Sorry, thursday is date night!"); 
            //  "Friday": print ("I'm free!!"); 
            //  "Saturday": print ("I'm free!!"); 
            //  "Sunday": print ("I'm free!!"); 
            //  "otherwise": print ("that's not a day."); 


    }
}