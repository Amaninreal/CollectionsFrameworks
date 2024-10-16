import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // it creates a empty array
//        size = n after n elements added --> n + n/2 + 1
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); // This will add 4 at the end of the list
        System.out.println(list);

        list.add(1, 50); // This will add 50 at the index 1
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(); // Creating a other list
        list2.add(120);
        list2.add(250);

        list.addAll(list2); // this will add all the elements in the prev list
        System.out.println(list);

        // Get the function
        System.out.println(list.get(1)); // This is get the first element
        System.out.println(list.getFirst()); // This will get zero index element

        for (int i = 0; i < list.size(); i++) { // This will give how many elements are there not the length
            System.out.println("The element is:" + list.get(i));
        }

        for (Integer i : list) { // For Each loop
            System.out.println("For Each loop" + i);
        }

        Iterator<Integer> iterator = list.iterator(); // This will return Iterator
        while (iterator.hasNext()) { // hasNext will until there is element it will work
            System.out.println("Iterator" + iterator.next()); // .next helps to next elements
        }
        // Remove the element
//        list.remove(1); // This will remove the 1st index by position
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(120)); // this will remove the element
//        System.out.println(list);
//
//        list.clear(); // This will remove all elements from the list
//        System.out.println(list);

//        list.set(2, 1000); // This will update the value
//        System.out.println(list);
//
//        System.out.println(list.contains(120)); // This will return boolean
//        System.out.println(list.contains(150));
    }
}
