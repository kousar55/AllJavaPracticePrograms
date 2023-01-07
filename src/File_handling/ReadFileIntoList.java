package File_handling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//WAP to read a file
public class ReadFileIntoList {
    //create a method
    public static List<String> readFileInList(String FileName){
        List<String> lines= Collections.emptyList();

        try{
            lines= Files.readAllLines(Paths.get(FileName),StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    return lines;
    }
    public static void main(String args[]){
        List l=readFileInList("C://Users//kousarj//OneDrive - AMDOCS//Backup Folders//Desktop//java/sampe.txt");
        Iterator<String> itr=l.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

    }
}
