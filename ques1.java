import java.util.*;
public class ques1 {
public static void main(String[] args) {
// Create a LinkedList
LinkedList<String> LL = new LinkedList<>();
// Add strings to the LinkedList
LL.add("London");
LL.add("Paris");
LL.add("New York");
LL.add("San Francisco");
LL.add("Beijing");
LL.add("Newyork");
System.out.println("After adding element" + LL);
LL.remove("London");
System.out.println("After removing elements" + LL);
}
}
