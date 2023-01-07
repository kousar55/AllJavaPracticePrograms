package File_handling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.rmi.server.ExportException;

public class Test {


    public static void main(String args[])throws IOException{
        try{
            Files.deleteIfExists(Paths.get("C://Users//kousarj//OneDrive - AMDOCS//Backup Folders//Desktop//sampe.txt"));
          }
        catch (Exception e){
            System.out.println("Exception Occured");
        }
       /* catch (DirectoryNotEmptyException e)
        {
            System.out.println("Directory not empty");
        }
        catch (IOException io)
        {
            System.out.println("Invalid Paramater");
        }

        */

        System.out.println("File deletion Successfull");

    }
}
