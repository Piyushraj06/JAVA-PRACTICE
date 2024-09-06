package AdvancePattern;
import java.util.*;

public class hollowRec {
    public static void hollow_rec(int tolrows , int tolcols){
        for(int i=1; i<=tolrows; i++){
            for(int j=1;j<=tolcols; j++){
                if(i==1 || i==tolrows || j==1 || j==tolcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        hollow_rec(4,5 );

    }
}
