public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){
            void show(){
                System.out.println("In Anonymous Class");
            }
        };
        obj.show();
    }
}
abstract class A{
    abstract void show();
}
// class A{
//     void show(){
//         System.out.println("In A");
//     }
// }
// these both are same