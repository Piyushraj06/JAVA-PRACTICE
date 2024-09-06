//example of armstrong number is :- 371 = (3^3+7^3+1^3) cube karna hai sb number ka whi ana chahie (27+343+1=371).
import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,t,num,sum=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        num=n;
        while(n!=0)
        {
            sum=sum+(int)Math.pow((n%10),3);
            n/=10;
        }
        if(num==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
    }
}
