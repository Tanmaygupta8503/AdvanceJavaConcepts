import java.util.Scanner;
public class TakingInputViaScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println("Integer: " + n);
        System.out.println("String: " + s);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        sc.close();
    }
}
