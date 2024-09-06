abstract class q4{
    abstract void eat();
    }
    class DogAnonymousInner{
    public static void main(String args[]){
    q4 obj=new q4()
    {
    void eat()
    {
    System.out.println("nice fruits");
    }
    };
    obj.eat();
    }
    }
