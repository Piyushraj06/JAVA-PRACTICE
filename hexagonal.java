import java.lang.Math;
import java.util.Scanner;

public class hexagonal {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        double s= sc.nextDouble();
        double area =((6*s*s)/(4*Math.tan(Math.PI/6)));
        System.out.printf("The area of hexagonal is  "+ "=" + area);
    }
    
}
