import main.userInteraction.*;
import main.logging.*;

public class App {

  
    public static void main(String[] args) {

       InfoLogger obj = new InfoLogger();
      obj.makeLog(); 
     
        
        Menu menu = new Menu();
        menu.runMenu();
        
    }
}
