package collection_in_java;
import java.util.Collection;
import java.util.*;

public class Array_of_object {
    public static void main(String args[]){

        ArrayList<String> arr=new ArrayList<>();
        arr.add("JAVA");
        arr.add("Python");
        arr.add("GoLang");
        System.out.println("Array before sort");
        System.out.println(arr);
        System.out.println("Array After Sort");

        Collections.sort(arr);

        for(String  i:arr) System.out.println(i);
    }
}
