package STS_QUIZ;
import java.util.Scanner;

public class Maxequi {
    static int max(int A[] , int n){
        int res = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int prefix_sum = A[i];
            for(int j=0; j<i; j++)
            prefix_sum += A[j];

            int suffix_sum = A[i];

            for(int j=n-1; j>i; j--)
            suffix_sum += A[j];

            if(prefix_sum == suffix_sum)
                res = Math.max(res, prefix_sum);

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        System.out.print("Enter the array values: ");
        int A[] = new int [n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(max(A,n));
    }
}
