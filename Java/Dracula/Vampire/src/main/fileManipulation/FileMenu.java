package main.fileManipulation;

import main.fileReader.ReadMyFile;
import main.userInteraction.*;

import java.io.File;
import java.util.Scanner;

public class FileMenu {
    boolean quitFile;

    public FileMenu(String string) {
    }
    
	public void runFileMenu() {
        printFileMenuHeader();
        while (!quitFile) {
            printFileMenu();
            int fileChoice = getFileInput();
            performFileAction(fileChoice);
        }
    }



    private void printFileMenuHeader() {
        System.out.println("******************************");
        System.out.println("           Filemenu           ");
        System.out.println("                              ");
        System.out.println("         Choose a file        ");
        System.out.println("******************************");
    }

    private void printFileMenu() {
        System.out.println("\n" + "1) File1");
        System.out.println("2) File2");
        System.out.println("3) File3");
        System.out.println("4) File4");
        System.out.println("5) File5");
        System.out.println("6) File6");
        System.out.println("7) File7");
        System.out.println("8) File8");
        System.out.println("9) File9");
        System.out.println("10) File10");
        System.out.println("11) File11");
        System.out.println("0) Back to main menu");
    }

    private int getFileInput() {
    Scanner sc = new Scanner(System.in);
    int fileChoice = -1;
    while (fileChoice < 0 || fileChoice >=3) {
        try {
            System.out.println("\n" + "Please enter what you want to do:");
            fileChoice = Integer.parseInt(sc.nextLine());
        } catch(NumberFormatException e) {
            System.out.println("invalid selection, try again.");
        }
    } 
    return fileChoice;
    }

    private void fileReader(String demoFileString) {
        ReadMyFile file = new ReadMyFile();
        file.fileReader(new File("Java/Dracula/Vampire/src/main/resourses/" + demoFileString));
    }
    

    private void performFileAction(int fileChoice) {
        switch(fileChoice) {
            case 0:
                quitFile = true;
                System.out.println("Thank you!");
                Menu menu = new Menu();
                menu.runMenu();
                break;
            case 1:
            fileReader("Dracula.txt");
                break;
            case 2:
            fileReader("Meme_1.jpeg");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                System.out.println("404 system not found!");
        }
    }    
}
