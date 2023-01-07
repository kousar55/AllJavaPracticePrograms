package collection_in_java;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Abcs");
        ll.add("sample");
        ll.add("simplilearn");

       // System.out.println("ll");
        System.out.println("siaplay items using while loop");
        Iterator<String> itr=ll.iterator(); //used to traverse across each and every item in LinkedList
        while(itr.hasNext()){  //knows iterator has next element
            System.out.println(itr.next());


        }

        for(String i:ll){   //display items using for-each loop
            System.out.println(i);
        }
    }
}
