package arraylistwithiterator;

import java.util.*;
/** 
   A driver that demonstrates the revised class ArrayListWithIterator.
 */
public class Driver  {
    
    public static void main (String args[]) {
            
        System.out.println("Create a list: ");

        ListWithIteratorInterface<String> myList = new ArrayListWithIterator<>();

        System.out.println("Testing add to end: Add A, B, C, D");
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        System.out.println("\nUsing ADT list operations hasNext and next:");

        displayList(myList);


        Iterator it = myList.getIterator();
        System.out.println("Execute the iterator's next() again:");
        try {
            it.next();		   // Should throw an error
            System.out.println("Oops... No exception");
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException was thrown as expected!");
        } // end catch

        System.out.println("\nBegin iteration again:");
        it = myList.getIterator();
        System.out.println("next() returns " + it.next() + " (should be A)");

        System.out.println("remove() should remove A");
        it.remove();

        System.out.println("next() returns " + it.next() + " (should be B)");
        System.out.println("next() returns " + it.next() + " (should be C)");

        System.out.println("remove() should remove C");
        it.remove();
        System.out.println();

        System.out.println("List state after all adds and removes");
        displayList(myList);

        System.out.println("\nExecute the iterator's remove() again:");
        try {
            it.remove();		   // Should throw an error
            System.out.println("Oops... No exception");
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException was thrown as expected!");
        } // end catch
        
    } // end main

    public static void displayList(ListWithIteratorInterface<String> aList) {

        System.out.println("The list contains " + aList.getLength() +
                            " string(s) running through iterator, as follows:");		

        Iterator it = aList.getIterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }  // end displayList

}  // end Driver