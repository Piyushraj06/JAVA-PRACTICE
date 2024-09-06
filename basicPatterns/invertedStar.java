package basicPatterns;
import java.util.*;

public class invertedStar {
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int n= 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
