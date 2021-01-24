package main.userInteraction;

import main.fileManipulation.FileMenu;
import main.fileManipulation.FileModMenu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Menu {
    boolean quit;

    public void runMenu() {
        printMenuHeader();
        while(!quit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }
    
    private void printMenuHeader() {
    
        System.out.println("*****************************************");
        System.out.println("                Welcome                  ");
        System.out.println("                  to                     ");
        System.out.println("               main menu                 ");
        System.out.println("*****************************************");
    }

    private void printMenu() {
        System.out.println("\n" + "Make a selection: ");
        System.out.println("1) Read file");
        System.out.println("2) Modify file");
        System.out.println("3) Available files");
        System.out.println("4) Files by type");
        System.out.println("5) Search for words in .txt file");
        System.out.println("0) Quit");
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice >= 15) {
            try {
                System.out.print("\n" + "Please enter selection: ");
                choice = Integer.parseInt(sc.nextLine());
            } 
            catch(NumberFormatException e) {
                System.out.print("Inavlid selection, try again.");
            }
        }
        return choice;
    }

    private void toFileMenu() {
        FileMenu file = new FileMenu(null);
        file.runFileMenu();
    }

    private void toModFileMenu() {
        FileMenu file = new FileMenu(null);
        file.runFileModMenu();
    }

    private void listFiles() {
        File directoryPath = new File("Java/Dracula/Vampire/src/main/resourses/");
        String contents[] = directoryPath.list();
        System.out.println("All the files in the resources foldes are: ");

        

        for (File file : directoryPath.listFiles()) {
            System.out.println("Name of the file: " + file.getName() + "\n Size of the file: " + file.length()
                                + "\n Lines in file: " +  "\n word found " + " times in file");
		}
    }

    private void findTxt() {
        File directoryPath = new File("Java/Dracula/Vampire/src/main/resourses/");
		System.out.println("------------All files------------");
		for (File file : directoryPath.listFiles()) {
			System.out.println(file.getName());
		}
		
		System.out.println("\n------------Txt files------------");
		File[] files=directoryPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		
		for (File file : files) {
			System.out.println(file.getName());
        }
        
        System.out.println("\n----------Jpg files-------------");
        File[] files2=directoryPath.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        for (File file2 : files2){
            System.out.println(file2.getName());
        }

        System.out.println("\n----------jpeg files-------------");
        File[] files3=directoryPath.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpeg");
            }
        });
        for (File file3 : files3){
            System.out.println(file3.getName());
        }

        System.out.println("\n----------png files-------------");
        File[] files4=directoryPath.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        });
        for (File file4 : files4){
            System.out.println(file4.getName());
        }

        System.out.println("\n----------jfif files-------------");
        File[] files5=directoryPath.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jfif");
            }
        });
        for (File file5 : files5){
            System.out.println(file5.getName());
        }
    }
    
    public void searchWord() {
        
        Scanner scW = new Scanner(System.in);
        System.out.println("Give the word you want to search");
        String wordToSearch = scW.nextLine();
        
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Java/Dracula/Vampire/src/main/resourses/Dracula.txt"));
            String currentLine = reader.readLine();
            while(currentLine != null) {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;
            for (String  word : words) {
                charCount = charCount + word.length();
            }
            currentLine = reader.readLine();
            }
            System.out.println("Number of chars in the file :" + charCount);
            System.out.println("Number of words in the file : " + wordCount);
            System.out.println("Number of lines in the file: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    private void performAction(int choice) {
        switch(choice) {
            case 0:
                quit = true;
                System.out.println("Bye bye!!!");
                break;
            case 1:
                toFileMenu();
                break;
            case 2:
                toModFileMenu();
                break;
            case 3:
                listFiles();
                break;
            case 4:
                findTxt();
                break;
            case 5:
            searchWord();
                break;
            default:
                System.out.println("404 system not found!"); 
        }
    }
}
