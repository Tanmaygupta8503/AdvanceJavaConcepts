import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;
public class ForEachViaConsumerInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2 , 3 , 4 , 5 , 6);
        // Consumer<Integer> consumer = new Consumer<Integer>() {
        //     @Override
        //     public void accept(Integer t) {
        //         System.out.println(t);
        //     }
        // };
        // list.forEach(consumer);

        // Consumer<Integer> consumer = t -> System.out.println(t);
        Stream<Integer> stream1 = list.stream();
        // stream1.forEach(t -> System.out.println(t));
        Stream<Integer> stream2 = stream1.filter(n -> n % 2 == 0);
        // stream2.forEach(t -> System.out.println(t));
        Stream<Integer> stream3 = stream2.map(n -> n * 2);
        // stream3.forEach(t -> System.out.println(t));
        int result = stream3.reduce(0, (a, b) -> a + b);
        System.out.println("One Line Stream " + (list.stream()).filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0 , (a, b) -> a + b));
        // same code as above using for loop
        int sum = 0;
        for(int num : list) {
            if(num % 2 == 0) sum += num*2;
        }
        System.out.println("using for loop " + sum);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                if(t % 2 == 0) return true;
                else return false;
            }
        };
        Predicate<Integer> predicate1 = t -> t % 2 == 0;
        Stream<Integer> stream4 = list.stream().filter(n -> n % 2 == 0).sorted();
        stream4.forEach(t -> System.out.println(t));
    }
}
