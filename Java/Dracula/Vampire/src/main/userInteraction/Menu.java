package main.userInteraction;
import main.fileManipulation.File;
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
        System.out.println("1) File menu");
        System.out.println("2) Good to know");
        System.out.println("3) Lose all hope");
        System.out.println("0) Quit");
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice >= 3) {
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
        File file = new File(null);
        file.runFileMenu();
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
                /*modifyFile();*/
                break;
            case 3:
                /*nervousBreakDown();*/
                System.out.println("Calling asylym...");
                break;
            default:
                System.out.println("404 system not found!"); 
        }
    }
}
