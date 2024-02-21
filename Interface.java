public class Interface {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        Developer obj = new Developer(); // pass the Computer object to the constructor
        obj.AppDev(desk); // pass the Computer object to the display method
        obj.AppDev(lap); // pass the Computer object to the display method
    }
}

// interface Computer {
    // int age = 21;
    // String name = "Tanmay";
    // by default all the variables in an interface are public, static and final (we don't need to write these keywords explicitly).
    // by default, all the methods in an interface are public and abstract (we don't need to write these keywords explicitly).
//     void code();
// }
abstract class Computer{
    abstract void code();
}

class Laptop extends /* Implements */ Computer {
    public void code() {
        System.out.println("In Laptop");
    }
}

class Desktop extends /* Implements*/ Computer {
    public void code() {
        System.out.println("In Desktop");
    }
}
interface A {
    void show();
}
interface X{
    void display();
}
interface Y extends A, X {
    void code();
}
// class Tablet implements A , X {
//     public void code() {
//         System.out.println("In Tablet");
//     }
//     public void show() {
//         System.out.println("In Tablet");
//     }
//     public void display() {
//         System.out.println("In Tablet");
//     }
// }

class Developer {
    public void AppDev(Computer lap) {
        lap.code();
    }
}
