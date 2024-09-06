class q1 {
    static void demoproc() {
    try {
    throw new NullPointerException("demo"); // creating one of Java’s standard exception objects.
    } catch(NullPointerException e) {
    System.out.println("Caught inside demoproc.");
    throw e; // rethrow the exception
    }
    }
    public static void main(String args[]) {
    try {
    demoproc();
    } catch(NullPointerException e) {
    System.out.println("Recaught: " + e);
    }
    }
    }
