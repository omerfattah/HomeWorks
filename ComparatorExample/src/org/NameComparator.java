package org;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Product p1 = (Product) obj1;
		Product p2 = (Product) obj2;
		return p1.name.compareTo(p2.name);
		
	}

}
