public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}
class WagonR extends Car{
    public  void drive() {
        System.out.println("Driving Method");
    }
}

//Ques: What is an Abstract Class?
//Ans: An abstract class is a class that is declared abstract—it 
// may or may not include abstract methods. Abstract classes cannot 
// be instantiated, but they can be subclassed.
