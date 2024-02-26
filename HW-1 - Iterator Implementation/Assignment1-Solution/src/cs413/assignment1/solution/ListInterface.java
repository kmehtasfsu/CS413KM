/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs413.assignment1.solution;

import java.util.*;

/**
 *
 * @author kmehta
 */
public interface ListInterface<E extends Comparable<? super E>> {
    
    /** Adds a new entry to the end of this list.
       The list size is increased by 1.
       @param newEntry  The object to be added as a new entry. */
    public void add(E newEntry);
   
    public boolean add(int newPosition, E newEntry);
   

    public Comparable remove(int givenPosition);

    /** Removes all entries from this list. */
    public void clear();
   

    public E replace(int givenPosition, E newEntry);
   
    /** Retrieves the entry at a given position in this list.
       @param givenPosition  An integer that indicates the position of
                             the desired entry.
       @return  A reference to the indicated entry.
       @throws  IndexOutOfBoundsException if either
                givenPosition < 1 or givenPosition > getLength(). */
    public Comparable getEntry(int givenPosition);
   
    /** Retrieves all entries that are in this list in the order in which
       they occur in the list.
       @return  A newly allocated array of all the entries in the list.
                If the list is empty, the returned array is empty. */
    public Comparable[] toArray();
   
   /** Sees whether this list contains a given entry.
       @param anEntry  The object that is the desired entry.
       @return  True if the list contains anEntry, or false if not. */
    public boolean contains(E anEntry);
    
    /** Gets the length of this list.
       @return  The integer number of entries currently in the list. */
    public int getLength();
       
    /** Sees whether this list is empty.
       @return  True if the list is empty, or false if not. */
    public boolean isEmpty();

} // end interface
