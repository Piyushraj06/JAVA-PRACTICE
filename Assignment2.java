import java.util.Queue;
import java.util.LinkedList;

class Assignment2{
    public static void main(String[]args){
        Queue <String> queueName = new LinkedList<String>();
        queueName.add("piyush");
        queueName.add("ayush");
        System.out.println("Before adding" + " " + queueName);
        queueName.add("Ritik");
        System.out.println("After Adding" + " " +queueName);
        queueName.remove(3);
        System.out.println("After removal" + " " + queueName);
        

    }
}
  