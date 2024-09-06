package STS_QUIZ;
import java.util.*;

public class MajorityEle {
    public static void main(String[] args) {
        HashMap <Integer,Integer> hashmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            hashmap.put(A[i], 0);
        }
        int max=0 , index=0;
        for(int i=0; i<n; i++){
            count = hashmap.get(A[i])+1;
            hashmap.put(A[i],count);

            if(count > max){
                max = count;
                index = i;
            }
        }
        if(max>n/2){
            System.out.println("Majority element: " + A[index]);
        }else{
            System.out.println("No Majority element.");
        }
    }
}
