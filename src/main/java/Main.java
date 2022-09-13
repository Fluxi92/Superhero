import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database superHeroDatabase = new Database();

        int userChoice = 0;
        do {
            System.out.println("""
                    Welcome to the SUPERHERO COLLECTOR!
                    Type 1 to CREATE A NEW HERO
                    Type 2 to CHECK YOUR COLLECTION OF HEROES!
                    TYPE 5 to EXIT THE PROGRAM
                    """);

            userChoice = sc.nextInt();
            sc.nextLine();
            if (userChoice == 1) {
                System.out.println("Enter the name of your superhero!");
                String heroName = sc.nextLine();
                System.out.println("Enter the superpower of your hero!");
                String superpower = sc.nextLine();
                System.out.println("When were your hero created?");
                int birthyear = sc.nextInt();
                System.out.println("What is the name of your hero, when he's not in uniform?");
                String realName = sc.next();
                System.out.println("How tall is your hero?");
                double height = sc.nextInt();
                System.out.println("What is the weight of your hero in kilograms?");
                int weight = sc.nextInt();
                System.out.println("From 1-99 rate the overall strenght of your superhero!");
                int overallStrenght = sc.nextInt();
            }
            if (userChoice != 2) {
                System.out.println("Here is a collection of your saved heroes!"); //+ få database her?!
            }

        } while (userChoice != 5);
        {
            System.out.println("Thank you for using the SUPERHERO COLLECTOR! Have a great day!");
        }
    }
}
