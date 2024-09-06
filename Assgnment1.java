import java.util.ArrayList;

class Assignment1{
    public static void main(String[]args){
        ArrayList <String> Name = new ArrayList <String>();
        Name.add("piyush");
        Name.add("ayush");
        System.out.println("Before adding" + " " + Name);
        Name.add("Ritik");
        System.out.println("After Adding" + " " +Name);
        Name.add(1,"rakesh");
        Name.add(0,"suresh");
        System.out.println(Name + " " + "After adding at index position "  );
        Name.remove(3);
        System.out.println(Name + " " + "After removal");
        


    }
}
  