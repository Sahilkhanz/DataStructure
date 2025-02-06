
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Using toString() Method
        System.out.println("num -> " + list);

        //usiong the for each 
        for (int cell : list) {
            System.out.println("Num -> " + cell);

        }

        //using the for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number -->  " + list.get(i));

        }

        // using the Enhanced  forEach
        list.forEach(num -> System.out.println(num));

    }
}


/*
ArrayList Method
1. add(E e)
2. add(index, element)
3. remove(element) removes the first occureence 
4. remove(index_position)
5. clear() clear the list
6. get(index)
7. set(index, element) replace the element
8. size() size of the lsit 
9. isEmpty() check idf the list is empty if empty it returns true
10.contains(obeject o) search the element if present returns true
11.indexOf(element 'like " sahil " ' ) first occurrenece of the element if present returns the index of it otherwise the -1
12.latIndexOf(element)  reutns the index the of the last occurrence of the element
*/
