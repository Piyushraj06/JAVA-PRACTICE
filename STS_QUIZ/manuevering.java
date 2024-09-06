package STS_QUIZ;
import java.util.Scanner;

public class manuevering {
    static int numberOfPaths(int m,int n){
        if(m == 1 || n == 1){
            return 1;
        }else{
            return numberOfPaths(m-1, n) + numberOfPaths(m, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m  value: ");
        int m = sc.nextInt();
        System.out.print("Enter n  value: ");
        int n = sc.nextInt();

        System.out.println(numberOfPaths(m, n));

    }
}
