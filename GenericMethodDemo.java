public class GenericMethodDemo {
    public static void main(String[] args ) {
    Integer[] integers = {1, 2, 3, 4, 5};
    Double[] double1 = {1.12, 2.3, 3.4, 4.5, 5.7};
    String[] strings = {"London", "Paris", "New York", "Austin"};
    GenericMethodDemo.<Integer>print(integers);
    GenericMethodDemo.<String>print(strings);
    GenericMethodDemo.<Double>print(double1);
    
    }
    public static <E> void print(E[] list) {
    for (int i = 0; i < list.length; i++)
    System.out.print(list[i] + " ");
    System.out.println();
    }
    }