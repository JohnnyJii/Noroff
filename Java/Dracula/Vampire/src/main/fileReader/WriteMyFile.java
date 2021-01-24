package main.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class WriteMyFile {
    
    public void fileWriter(File fileModMenu) {;


        try (BufferedReader bf = new BufferedReader(new FileReader(fileModMenu))) {
            String writeLine;

            while((writeLine = bf.readLine()) != null) {
                System.out.println(writeLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
