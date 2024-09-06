import java.util.Scanner;
public class exercise{
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer");
        long n = in.nextInt();
        System.out.println("The sum of the digit is " + sumDigits(n));
    }
    public static int sumDigits(long n){
        int sum =0;
        while(n !=0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}