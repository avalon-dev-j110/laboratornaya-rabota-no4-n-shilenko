package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * @author Nikolai Shilenko
 *
 */
public class SortImpl implements Sort {

	@Override
	public void sort(Object[] array) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i = 1; i < array.length; i++) {
				if(array[i].toString().compareTo(array[i - 1].toString()) < 0) {
					Object temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					isSorted = false;
				}
			}
		}
	}

	@Override
	public void sort(Comparable<Person>[] array) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 1; i < array.length; i++) {
				if (array[i].compareTo((Person) array[i - 1]) < 0) {
					Comparable<Person> temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					isSorted = false;
				}
			}
		}
	}
	 
	@Override
	public void sort(Object[] array, Comparator<String> comparator) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i = 1; i < array.length; i++) {
				if(comparator.compare(array[i].toString(), array[i - 1].toString()) < 0) {
					Object temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					isSorted = false;
				}
			}
		}
	}
}
