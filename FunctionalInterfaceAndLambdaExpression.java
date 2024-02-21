@FunctionalInterface // SAM (Single Abstract Method) Interface
// 1.8+ only, not supported in Java 7 or earlier versions
// ques: what is functional interface?
interface A{
    void show(int n);
}
// class B implements A{
//     public void show(int n){
//         System.out.println("In Show Method " + n);
//     }
// }
public class FunctionalInterfaceAndLambdaExpression {
    public static void main(String[] args) {
        // A obj1 = new A(); // cant instantiate the interface
        A obj = new A(){
            public void show(int n){
                System.out.println("In Show Method " + n);
            }
        };
        A obj2 = new A(){
            public void show(int n){
                System.out.println("In Show Method " + n);
            }
        };
        A obj1 = (n) -> System.out.println("In Show Method " + n);
        A obj4 = n -> System.out.println("In Show Method " + n);

        // lambda expression
        obj.show(5);
    }
}
