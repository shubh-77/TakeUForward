import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(5);
        al.add(4);
        al.add(5);


        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        System.out.println(Collections.frequency(al, 5));
        System.out.println((int)Math.pow(2, 5));


        



    }
}
