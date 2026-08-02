import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] moni)
    {

        double width=0;
        double height=0;
        double area=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width: ");
        width=sc.nextDouble();
        System.out.println("Enter the height: ");
        height=sc.nextDouble();

        area=width*height;

        System.out.println("area of rectangle is: "+ area+" "+ "cm^2");



        sc.close();

    }
}
