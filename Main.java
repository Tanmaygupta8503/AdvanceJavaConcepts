public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile"); // class loading without object creation
        Mobile.name = "smart phone";
        System.out.println(Mobile.name);
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1234;
        obj.show();
        Mobile.show1();
        Mobile.show2(obj);
    }
}
class Mobile {
    static String name;
    String brand;
    int price;
    static{
        name = "phone";
        System.out.println("In Static Block");
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }
    
    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mobile other = (Mobile) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    public void show() {
        System.out.println("Brand : "+brand+"\nPrice : "+price+"\nDevice Name : "+name);
        System.out.println("In show method");
    }
    public static void show1(){
        // only static variable can be used in this methods and non static can't be used in this method this will give error
        System.out.println("In static show method");
    }
    public static void show2(Mobile obj){
        // only static variable can be used in this methods and non static can't be used in this method this will give error
        System.out.println("Brand : "+obj.brand+"\nPrice : "+obj.price+"\nDevice Name : "+obj.name);
        System.out.println("In static show method");
    }
    public Mobile() {
        brand = "";
        price = 200;
    }
} 
