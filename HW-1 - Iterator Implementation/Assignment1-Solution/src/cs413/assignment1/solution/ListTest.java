/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs413.assignment1.solution;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author kmehta
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        testMyLinkedListWithIterator();
        
    }
    

    public static void testMyLinkedListWithIterator() {

        LinkedListWithIterator<String> myll = new LinkedListWithIterator();
        
        myll.add("Karun");
        myll.add("James");
        myll.add("Jones");
        myll.add("Harry");
        myll.add("Peter");
        
        Iterator it = myll.getIterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
    }

    public static void displayList(List<String> list) {
       
      int numberOfEntries = list.size();
      System.out.println("The list contains " + numberOfEntries +
                         " entries, as follows:");
      for (int position = 1; position <= numberOfEntries; position++)
         System.out.println(list.get(position - 1) +
                            " is entry " + position);
      
    } // end displayList
            
    
    public static void testMyLList() {
        
        int loc;
        Comparable nm1, nm2;
        boolean result;

        ListInterface<String> myll = new MyLList();
        
        myll.add("Karun");
        myll.add("James");
        myll.add("Jones");
        myll.add("Harry");
        myll.add("Peter");
        myll.add("Tim");
        
        System.out.println("\nInitial state of Linked List:");
        
        Comparable[] dataArray = myll.toArray();
        
        for(int i = 0; i < myll.getLength(); i++) {
            System.out.println((String)dataArray[i]);
        }
        
        loc = 1;
        System.out.println("\nItem removed at location: " + loc + " of the list is " + myll.remove(loc));
        
        System.out.println("\n Second state of Linked List:");        
         
        dataArray = myll.toArray();
        
        for(int i = 0; i < myll.getLength(); i++) {
            System.out.println((String)dataArray[i]);
        }        

        nm1 = "Sara";
        nm2 = myll.getEntry(loc);
        
        System.out.println("Check to see if 'Karun' is in the node result is: " + myll.contains("Karun"));
        System.out.println("Check to see if 'Sara' is in the node result is: " + myll.contains(nm2.toString()));
        
        String replacedString = myll.replace(loc, nm1.toString());
        System.out.println("\n\nAttempt to replace: " + nm2 + " with " + nm1 + " returned: " + replacedString);

        System.out.println("\nThird state of Linked List:");        
        
        dataArray = myll.toArray();
        
        for(int i = 0; i < myll.getLength(); i++) {
            System.out.println((String)dataArray[i]);
        }        
        loc = 2;
        System.out.println("\nElement at location: " + loc + " is: " + myll.getEntry(loc));
        
        System.out.println("Size of the list in current state is: " + myll.getLength());
        
        myll.add(3, "Taylor");
        
        System.out.println("\nFinal state of list:");
        
        System.out.println(myll.toArray());

    }
    
}
