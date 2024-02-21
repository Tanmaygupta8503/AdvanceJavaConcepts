public class demo{
    public static void main(String[] args){
        // B obj = new B(4);
        new A(); // anonymous object
    }
}
class A{
    A(){
        super();
        System.out.println("A -> i am anomymous");
    }
    A(int x){
        super();
        System.out.println("A's parameterized constructor");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("B's constructor");
    }
    B(int x){
        this();
        System.out.println("B's parameterized constructor");
    }
}