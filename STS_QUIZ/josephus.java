package STS_QUIZ;
import java.util.*;

public class josephus {
    static int josephusTrap(int n , int k){
        if(n==1)
        return 1;
        else
        return (josephusTrap(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of n is: ");
        int n = sc.nextInt();
        System.out.println("The value of k is: ");
        int k = sc.nextInt();
        System.out.println("The choosen place is: "+josephusTrap(n,k));
    }
}
