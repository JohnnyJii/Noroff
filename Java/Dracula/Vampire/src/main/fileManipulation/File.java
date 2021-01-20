package main.fileManipulation;
import main.userInteraction.*;
import java.util.Scanner;

public class File {
    boolean quitFile;

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
        System.out.println("******************************");
    }

    private void printFileMenu() {
        System.out.println("\n" + "1) Modify");
        System.out.println("2) Descripe");
        System.out.println("3) Data");
        System.out.println("0) Back to main menu");
    }

    private int getFileInput() {
    Scanner sc = new Scanner(System.in);
    int fileChoice = -1;
    while (fileChoice < 0 || fileChoice >=3) {
        try {
            System.out.println("\n" + "Please enter what you want to do:");
            fileChoice = Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException e) {
            System.out.println("invalid selection, try again.");
        }
    } 
    return fileChoice;
    }

    private void performFileAction(int fileChoice) {
        switch(fileChoice) {
            case 0:
                quitFile = true;
                Menu menu = new Menu();
                menu.runMenu();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("404 system not found!");
        }
    }
}
