package STS_QUIZ;
import java.util.*;

public class leadersInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int max_from_right = 0;
        for(int i=n-1; i>=0;i--){
            if(max_from_right<A[i]){
                max_from_right = A[i];
                System.out.print(max_from_right + " ");
            }
        } 

        
    }
}
