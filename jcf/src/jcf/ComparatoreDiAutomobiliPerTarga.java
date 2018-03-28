package jcf;

import java.util.*;

public class ComparatoreDiAutomobiliPerTarga implements Comparator{

	public int compare(Object o1, Object o2) {
		
		Automobile a1 = (Automobile)o1;
		Automobile a2 = (Automobile)o2;
		
		return a1.getTarga().compareTo(a2.getTarga());
			
		
	}
	
}
