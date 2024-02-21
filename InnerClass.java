
public class InnerClass {

    public static void main(String[] args) {
        A.C obj = new A.C(); // static class object accessing with class name
        obj.display(); // calling display method of C class
        A a = new A(); // A class object
        a.display(); // calling display method of A class
        A.B b = a.new B(); // accessing B class using A is object
        b.display(); // calling display method of B class 
    }
}

class A{
    int a = 9;
    class B{
        int b = 8;
        void display(){
            System.out.println("In Class B");
        }
    }
    static class C{
        int c = 7;
        void display(){
            System.out.println("In Class C");
        }
    }
    void display(){
        class D{
            int d = 6;
            void display(){
                System.out.println("In Class D");
            }
        }
        D obj = new D();
        obj.display();
        System.out.println("In Class A");
    }
}