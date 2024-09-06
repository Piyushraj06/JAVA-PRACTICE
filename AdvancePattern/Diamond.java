package AdvancePattern;

public class Diamond {
    public static void Diamond_pat(int  n){
        //First half

        for(int i=1; i<=n; i++){

            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second Half
        for(int i=n; i>=1; i--){

            //for spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String args[]){
        Diamond_pat(7);
    }
    
}
