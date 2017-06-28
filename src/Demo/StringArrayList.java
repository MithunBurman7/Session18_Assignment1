package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

	public static void main(String[] args) {
		// here we're creating a ArrayList object
        ArrayList<String> elementlist = new ArrayList<String>();
        // here we're Adding elements to Element
        elementlist.add("Mithun");
        elementlist.add("Vishwas");
        elementlist.add("Pallav");
        elementlist.add("Negi");
        elementlist.add("Barun");
	
        //here we took an Iterator object for ArrayList using Iterator() method
        Iterator<String> itr = elementlist.iterator();
        // Here we use hasNext() and next () methods of Iterator to Iterator
        // through the elements
        System.out.println("Iterator through the Element");
        while (itr.hasNext())
        	System.out.println(itr.next());
        }

}
