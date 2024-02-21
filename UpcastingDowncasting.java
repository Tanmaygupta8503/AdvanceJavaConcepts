public class UpcastingDowncasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // Upcasting
        obj.show1();   
        B obj1 = (B)obj; // downcasting
        obj1.show2();
    }
}
class A {
    void show1() {
        System.out.println("In A");
    }
}
class B extends A{
    void show2() {
        System.out.println("In B");
    }
}
