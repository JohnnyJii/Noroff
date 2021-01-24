package main.fileManipulation;

import java.io.File;
import java.util.Scanner;
import main.userInteraction.*;


public class FileModMenu {
    boolean quitModFile;
    
    public FileModMenu(String string) {
    }

    public void runFileModMenu() {
        printModFileMenuHeader();
        while(!quitModFile) {
            printModFileMenu();
            int fileModChoice = getModFileInput();
            performModFileAction(fileModChoice);
        }
    }

    private void printModFileMenuHeader() {
        System.out.println("******************************");
        System.out.println("       Choose a file          ");
        System.out.println("          you want            ");
        System.out.println("          to modify           ");
        System.out.println("******************************");
    }

    private void printModFileMenu() {
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

    private int getModFileInput() {
        Scanner sc = new Scanner(System.in);
        int fileModChoice = -1;
        while (fileModChoice < 0 || fileModChoice >=3) {
            try {
                System.out.println("\n" + "Please enter what you want to do:");
                fileModChoice = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("invalid selection, try again.");
            }
        } 
        return fileModChoice;
        }   
    
        private void performModFileAction(int fileModChoice) {
            switch(fileModChoice) {
                case 0:
                    quitModFile = true;
                    System.out.println("Thank you!");
                    Menu menu = new Menu();
                    menu.runMenu();
                    break;
                case 1:
                    break;
                case 2:
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
                case 12:
                default:
                    System.out.println("404 system not found!");
            }
    }
}
