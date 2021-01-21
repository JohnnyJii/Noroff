package main.fileManipulation;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileService {
    File story = new File("Dracula.txt");
    File meme1 = new File("Meme_1.jpeg");
    File meme2 = new File("Meme_2.png");
    File meme3 = new File("Meme_3.jpg");
    File meme4 = new File("Meme_4.jpg");
    File meme5 = new File("Meme_5.jpg");
    File meme6 = new File("Meme_6.jpeg");
    File meme7 = new File("Meme_7.jpeg");
    File meme8 = new File("Meme_8.jfif");
    File meme9 = new File("Meme_9.jfif");
    File meme10 = new File("Meme_10.jfif");
    File meme11 = new File("Meme_11.jfif");

public void fileCheck() throws FileNotFoundException {
    File story = new File("Dracule.txt");
    Scanner fileReader = new Scanner((Readable) story);
    while (fileReader.hasNextLine()) {
        String data = fileReader.nextLine();
        System.out.println(data);
    }
    fileReader.close();
}
}
