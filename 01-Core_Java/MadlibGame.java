import java.util.Scanner;
public class MadlibGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String noun2;
        String verb1;


        System.out.println("enter an adjective(description): ");
        adjective1=sc.nextLine();

        System.out.println("enter an adjective(description): ");
        adjective2=sc.nextLine();

        System.out.println("enter an adjective(description): ");
        noun1=sc.nextLine();

        System.out.println("enter an adjective(description): ");
        noun2=sc.nextLine();

        System.out.println("enter an adjective(description): ");
        verb1=sc.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit I saw a "+ noun1 + ".");
        System.out.println("Today I went to a "+ adjective2 + " zoo.");
        System.out.println("In an exhibit I saw a "+ noun2 + ".");
        sc.close();
    }
}