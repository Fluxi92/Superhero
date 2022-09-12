import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // velkomst besked
        System.out.println("Welcome to Superhero World!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the name of your hero!");
        String heroName = sc.nextLine();
        System.out.println();

        System.out.println("Type in the superpower of your hero!");
        String superpower = sc.nextLine();
        System.out.println();

        System.out.println("Type in the birth year of your hero!");
        int birthyear = sc.nextInt();
        System.out.println();

        System.out.println("Type the real life name of your superhero");
        String realName = sc.next();
        System.out.println();

        System.out.println("Type in the height in centimeters of your hero");
        double height = sc.nextInt();
        System.out.println();

        System.out.println("Type in the weight in kilos of your hero");
        int weight = sc.nextInt();
        System.out.println();
    }
}
