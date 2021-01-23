package main.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import main.fileManipulation.FileMenu;

public class ReadMyFile {

    public void fileReader(File fileMenu) {
        try (BufferedReader bf = new BufferedReader(new FileReader(fileMenu))) {
            String bookLine;

            while ((bookLine = bf.readLine()) != null) {
                System.out.println(bookLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
