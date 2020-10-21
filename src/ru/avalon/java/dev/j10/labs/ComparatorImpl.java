package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * @author Nikolai Shilenko
 *
 */
public class ComparatorImpl implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
