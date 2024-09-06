import java.util.*;
class fact
{
    int factorial(int n)
{
    if(n==1)
    {
        return 1;
    }
    else
    {
        return n*factorial(n-1);
    }
}
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    fact ob=new fact(); 
    int n,f;
    System.out.println("Enter the number");
    n=sc.nextInt();
    f=ob.factorial(n);
    System.out.println("The factorial of "+n+" is "+f);
    }
}
