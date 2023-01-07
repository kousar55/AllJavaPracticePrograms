package collection_in_java;

import java.util.ArrayList;

public class Generic_Array {

    public static void main(String args[]){


        ArrayList al=new ArrayList();    //Generic type of collection ArrayList we are using here
        al.add("Java");  //Adding element in al array
        al.add(20);
        al.add(30.40);

        System.out.println(al);   //display elements

        al.remove(2);   //removing particular value
        System.out.println("After removing Element"+al);

        al.set(0,"simplilearn");


        System.out.println("after adding new item" +al);
    }
}
