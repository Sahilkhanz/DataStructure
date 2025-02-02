
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("num -> " + list);

        for (int cell : list) {
            System.out.println("Num -> " + cell);

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number -->  " + list.get(i));

        }

        list.forEach(num -> System.out.println(num));

    }
}
