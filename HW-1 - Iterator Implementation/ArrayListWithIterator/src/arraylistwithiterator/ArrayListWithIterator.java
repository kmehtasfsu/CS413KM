package arraylistwithiterator;

import java.util.*;

/**
   A class that implements the ADT list by using a resizable array.
   The list has an iterator. The class extends AList.

   @author Frank M. Carrano
   @version 5.0
 */
public class ArrayListWithIterator<T> extends AList<T> implements ListWithIteratorInterface<T>
{
	public ArrayListWithIterator()
	{
		super();
	} // end default constructor

	public ArrayListWithIterator(int initialCapacity)
	{
		super(initialCapacity);
	} // end constructor

	public Iterator<T> getIterator()
	{
		return new IteratorForArrayList();
	} // end getIterator

	public Iterator<T> iterator()
	{
		return getIterator();
	} // end iterator

	private class IteratorForArrayList implements Iterator<T>
	{
		private int     nextPosition;  // Position of next entry in the iteration 
		private boolean wasNextCalled; // Needed by remove

		private IteratorForArrayList()
		{
			nextPosition = 1;
			wasNextCalled = false;
		} // end default constructor

		public boolean hasNext()
		{
			return nextPosition <= getLength();
		} // end hasNext

		public T next()
		{
			if (hasNext())
			{
				wasNextCalled = true;
				T nextEntry = getEntry(nextPosition);
				nextPosition++; // Advance iterator

				return nextEntry;
			} // end if
			else
				throw new NoSuchElementException("Illegal call to next();" +
						"iterator is after end of list.");
		} // end next

		public void remove()
		{
			if (wasNextCalled)
			{
				// nextPosition was incremented by the call to next, so it 
				// is 1 more than the position number of the entry to be removed
				nextPosition--;  // Index of next entry in iteration
				ArrayListWithIterator.this.remove(nextPosition);
				wasNextCalled = false;	// Reset flag
			} // end if
			else
				throw new IllegalStateException("Illegal call to remove(); " +
						"next() was not called.");
		} // end remove		
	} // end IteratorForArrayList
} // end ArrayListWithIterator

