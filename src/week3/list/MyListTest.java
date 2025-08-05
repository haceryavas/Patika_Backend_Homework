package week3.list;

/**
 * @author Hacer Nur YAVAŞ - 5 August 2025
 *
 * This class is used to test the functionality of the custom generic list class MyList<T>.
 *
 * The MyListTest class demonstrates the following operations:
 *
 * - Adding elements to the custom list.
 * - Retrieving elements by index.
 * - Removing elements from a given index.
 * - Updating elements at a specific index.
 * - Checking the current size and capacity of the list.
 * - Converting the list to a string representation.
 * - Checking if the list is empty.
 * - Finding the first and last occurrence of an element using indexOf and lastIndexOf.
 * - Converting the list to an Object array.
 * - Creating a sublist from the main list.
 * - Checking whether certain values exist in the list using contains.
 * - Clearing the entire list and resetting it to its default capacity.
 *
 * This test class serves as a sample usage of the MyList<T> implementation
 * and helps to verify the correctness of each method.
 */

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();

        // Checking the size and capacity of the list
//        System.out.println("Number of elements in list: " + list.size());
//        System.out.println("Capacity of the list: " + list.getCapacity());
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println("Number of elements in list: " + list.size());
//        System.out.println("Capacity of the list: " + list.getCapacity());
//
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//        list.add(110);
//
//        System.out.println("Number of elements in list: " + list.size());
//        System.out.println("Capacity of the list: " + list.getCapacity());

        //----------------------------------------------------------------------

        // Testing basic add, get, remove, and set methods
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println("Value at index 2: " + list.get(2));        // Should print 30
//        list.remove(2);                                             // Remove the element at index 2 (30 is removed)
//        list.add(40);
//        list.set(0, 100);                                              // Replace value at index 0 with 100
//        System.out.println("Value at index 2: " + list.get(2));        // Should print 40
//        System.out.println(list.toString());                           // Print the current contents of the list

        //----------------------------------------------------------------------
          // Check if the list is empty
        System.out.println("List status: " + (list.isEmpty() ? "Empty" : "Not Empty"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List status: " + (list.isEmpty() ? "Empty" : "Not Empty"));

        // Find first index of value 20
        System.out.println("Index : " + list.indexOf(20));

        // Try to find a non-existent value
        System.out.println("Index :" + list.indexOf(100)); // Should return -1

        // Find last index of value 20
        System.out.println("Index : " + list.lastIndexOf(20));

        // Convert list to Object[] array
        Object[] array = list.toArray();
        System.out.println("First element of Object array: " + array[0]);

        // Create a sublist from index 0 to 2 (inclusive)
        MyList<Integer> mySubList = list.subList(0, 3);
        System.out.println(mySubList.toString());

        // Check if the list contains a specific element
        System.out.println("Does list contain 20? " + list.contains(20));
        System.out.println("Does list contain 120? " + list.contains(120));

        // Clear the list and reset it to its default capacity
        list.clear();
        System.out.println(list.toString());

    }
}
