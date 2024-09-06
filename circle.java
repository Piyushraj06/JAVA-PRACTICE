import java.math.*;
public class circle {
    private static double radius = 7.5;
    public static void main(String args[]){
        double area = Math.PI * radius * radius;
        double perimeter = 2*Math.PI*radius;
        System.out.println(area);
        System.out.println(perimeter);
    }
    
}
