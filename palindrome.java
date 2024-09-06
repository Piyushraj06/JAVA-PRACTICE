//example of palindrome number is (121 = 121),, example of not a palindrome number is:- (234 = 432).
import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,t,num,rev=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        num=n;
        while(n!=0)
        {
            rev=(rev*10) + (n%10);
            n/=10;
        }
        if(num==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
