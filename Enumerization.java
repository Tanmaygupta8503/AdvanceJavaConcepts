public class Enumerization {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Success;
        System.out.println(s);
        int n = s.ordinal();
        System.out.println(n);
        Status arr[] = Status.values();
        for (Status st : arr) {
            System.out.println(st + "\tat index " + st.ordinal());
        }
        Status netStatus = Status.Pending;
        if(netStatus == Status.Pending) {
            System.out.println("Pending");
        } else if(netStatus == Status.Failure){
            System.out.println("Failure");
        } else if(netStatus == Status.Running){
            System.out.println("Running");
        } else {
            System.out.println("Success");
        }
        netStatus = Status.Running;
        switch(netStatus){
            case Running->{
                System.out.println("Running");
            }
            case Failure->System.out.println("Failure");
            case Pending->System.out.println("Pending");
            case Success->System.out.println("Success");
        }
        System.out.println(netStatus.getClass());
        System.out.println(netStatus.getClass().getSuperclass());
        

        for(Laptops lap : Laptops.values()){
            System.out.println(lap + " costs " + lap.getPrice());
        }
    }
}
enum Status {
    Running, Failure , Pending , Success;
}


enum Laptops{
    Dell(2000), HP(1000), Lenovo(1500), Acer(100), Asus;
    private int price;
    private Laptops() {
        System.out.println("In Laptops default " + this.name());
        price = 500;
    }
    private Laptops(int price) {
        System.out.println("In Laptops " + this.name());
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}