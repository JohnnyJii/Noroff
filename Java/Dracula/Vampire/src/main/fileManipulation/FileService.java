package main.fileManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileService {
   
    private void fileCheck() {

       try {
           File myObj = new File("Java/Dracula/Vampire/src/main/recourses/Dracula.txt");
           Scanner myReader = new Scanner(myObj);

           while(myReader.hasNextLine()) {
               String data = myReader.nextLine();
               System.out.println(data);
           }
           myReader.close();
       } catch (FileNotFoundException e) {
           System.out.println("error occurred");
           e.printStackTrace();
       }

    }
}
