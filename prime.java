import java.util.*;
class Prime {
    void prime(int n)
{
    int i,c=0;
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        c++;
    }
    if(c==1)
    {
        System.out.print(n+"  ");
    }
    }
    public static void main(String[] args) {
        Prime ob =new Prime();
        System.out.println("Prime numbers between 1 tp 100 are ");
        for(int i=1;i<100;i++)
        {
         ob.prime(i);   
        }
    }
}
