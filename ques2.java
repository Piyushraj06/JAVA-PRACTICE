import java.util.HashSet;
import java.util.Set;

class ques2 {
  public static void main(String[] args) {

    // create the first set
    Set<Integer> evenNumbers = new HashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("Set1: " + evenNumbers);

    // create second set
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(3);
    System.out.println("Set2: " + numbers);

    // Union of two sets
    numbers.addAll(evenNumbers);
    System.out.println("Union is: " + numbers);
  }
}
