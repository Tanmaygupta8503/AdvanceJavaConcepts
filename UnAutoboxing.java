public class UnAutoboxing {
    public static void main(String[] args) {
        int n = 7;
        Integer n1 = n; // Auto-Boxing
        Integer n2 = new Integer(n); // Boxing
        int n3 = n1; // auto-Unboxing
        int n4 = n2.intValue(); // Unboxing
        
        System.out.println("Auto-Boxing: " + n1);
        System.out.println("Boxing: " + n2);
        System.out.println("Auto-Unboxing: " + n3);
        System.out.println("Unboxing: " + n4);
    }
}
