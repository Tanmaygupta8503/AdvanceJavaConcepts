public class SealedClass {
    public static void main(String[] args) {
        
    }
}
sealed class A extends Thread implements Cloneable permits B, C {
    // code
}
non-sealed class B extends A {
    // code
}
final class C extends A {
    // code
}

// what is sealed class in points?
// Sealed classes and interfaces were introduced in Java 17 as a feature to enhance type safety and control over class hierarchies.
// Sealed classes and interfaces can only be extended or implemented by a specific set of classes or interfaces, which are explicitly listed in a permits clause.
// The permitted classes or interfaces can be declared as final, sealed, or non-sealed.
// Sealed classes and interfaces are useful for creating a closed set of related classes or interfaces that can be easily reasoned about and manipulated in a type-safe way.
// Sealed classes and interfaces cannot be mocked or faked, which can be a testing impediment.
// Conceptually, a sealed class is a more flexible alternative to a final class, which completely prohibits extension. A sealed class can be extended by a fixed set of classes or interfaces, providing a more declarative way to restrict the use of a superclass than access modifiers.
// Using pattern matching with sealed classes and interfaces allows the Java compiler to check that all permitted classes are covered, ensuring type safety and reducing the risk of runtime errors.


// Code Example:
sealed abstract class Shape permits Circle, Rectangle, Square {
    public abstract double getArea();
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle extends Shape {
    private final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

final class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

// Ques example for the interface using sealed?

sealed interface X permits Y , Z {
    // code
}
sealed interface Z extends X permits L{
    // code
}
non-sealed interface Y extends X{
    // code
}
non-sealed interface L extends Z{
    // code
}
