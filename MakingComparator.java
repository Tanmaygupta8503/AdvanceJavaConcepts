import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class MakingComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hi");
        list.add("Bye");
        list.add("Good");
        list.add("worse");
        list.add("I");
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else return -1;
            }
        }; 
        Collections.sort(list , com);
        System.out.println(list);
    }
}
