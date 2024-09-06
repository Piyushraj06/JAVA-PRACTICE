import java.util.Scanner;
public class average {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number =");
        int num1 = sc.nextInt();

        System.out.println("Enter second number =");
        int num2 = sc.nextInt();

        System.out.println("Enter third number =");
        int num3 = sc.nextInt();

        System.out.println("Enter Fourth number =");
        int num4 = sc.nextInt();

        System.out.println("Enter Fifth number =");
        int num5 = sc.nextInt();

        double average =(num1+num2+num3+num4+num5) /(5);

        System.out.println(average);


    }
}
