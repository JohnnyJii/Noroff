package main.fileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteMyFile {
    
    public void fileWriter(File fileModMenu) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Give me sentence: ");
        String sentence = sc.nextLine();

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
