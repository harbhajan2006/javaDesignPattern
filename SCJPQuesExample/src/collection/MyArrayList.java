package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class MyArrayList implements List {

	private int initialCapacity=10;
	private int size=0;
	private Object emptyObj[]={};
	private Object elementData[];
	public MyArrayList() {
		this.elementData = emptyObj;
		// TODO Auto-generated constructor stub
	}
	
	
	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = emptyObj;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        }
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		// if size is 0 , then add element
		ensureCapacityInternal(size+1);
		elementData[size++]=e;
		return true;
	}

	private void ensureCapacityInternal(int minCapacity){
		if(elementData==emptyObj){
			minCapacity= Math.max(initialCapacity, minCapacity);
		}
		
		ensureExplicitCapacity(minCapacity);
	}
	
	private void ensureExplicitCapacity(int minCapacity){
		if (minCapacity - elementData.length > 0)
            grow(minCapacity);	
		}
	

private void grow(int minCapacity){
	int oldCapacity=elementData.length;
	int newCapacity=minCapacity;
	elementData = Arrays.copyOf(elementData, newCapacity);
	
}
	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		for(int index = 0; index<size; index++){
			
			if(o==null){
				if(elementData[index]==null){
					elementData[index]=null;
					
					int numMoved = size - index - 1;
			        if (numMoved > 0)
			            System.arraycopy(elementData, index+1, elementData, index,
			                             numMoved);	
			        size--;
			        return true;
				}
			}else{
			if(elementData[index].equals(o)){
				elementData[index]=null;
				
				int numMoved = size - index - 1;
		        if (numMoved > 0)
		            System.arraycopy(elementData, index+1, elementData, index,
		                             numMoved);	
				size--;
				return true;
				// shift the capacity
			}}
		}
		return false;
	}

	@Override
	public String toString() {
		
		String data="";
		for(int index=0; index<size;index++){
			data = data + " " + elementData[index];
		}
		return "MyArrayList []" + data ;
	}


	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		Vector v;
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		 for (int i = 0; i < size; i++)
	            elementData[i] = null;

	        size = 0;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return elementData[index];
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
