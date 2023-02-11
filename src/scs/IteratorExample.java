package scs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add("C");
		lst.add("C++");
		lst.add("DS");
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			Object s = it.next();
			System.out.println(s.toString());
			
		}

	}

}
