class TanmayException extends Exception {
    public TanmayException(String s) {
        super(s);
    }
}
class A {
    A() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}
public class ExceptionHandelling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int arr[] = new int[5];
        String str = null;
        try{
            A obj = new A();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        }
        try {
            j = 18/20;
            if(j == 0) throw new TanmayException("Kuch toh gadbad hai Bhaiya");
            arr[7] = 10; // Out of Boundary exception
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
        catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
