package File_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class File_handling_sample_example {

    public static void main(String args[]) throws IOException {

        CreateFileUsingClass();

        CreateFileUsingFileOutputStreamClass();

        CreateFileNonIO();

    }
   private static void CreateFileNonIO()throws IOException{



   }
    private static void  CreateFileUsingFileOutputStreamClass() throws IOException{
        String data="Welcome to File Handling";
        FileOutputStream out =new FileOutputStream("C://Users//kousarj//OneDrive - AMDOCS//Backup Folders//Desktop//java/MyFile1.txt ");
        out.write(data.getBytes());

        out.close();
    }
    private static void CreateFileUsingClass () throws IOException{
        File f=new File("C://Users//kousarj//OneDrive - AMDOCS//Backup Folders//Desktop//java/MyFile.txt");

        if(f.createNewFile()){
            System.out.println("File Created");

        }
        else
        {  System.out.println("File Already Exist");}

        FileWriter fw=new FileWriter(f);
        fw.write("Hey are you in JAVA");
        fw.close();
    }
}
