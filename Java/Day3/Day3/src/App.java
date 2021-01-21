public class PascalCase {
    public static void main(String[] args) {
        String a1 = "pineapple on pizzas";
        String a2 = "the lazy dog jumps over bridge";
        String a3 = "The qUick!  bRoWn fox    jumped, OVER the    lazy. dog";

        System.out.println(ConvertPascal(a1));
        System.out.println(ConvertPascal(a2));
        System.out.println(ConvertPascal(a3));
    }
      private static String ConvertPascal(String a) {
          String[] parts = a.split(" +");
           for(int i = 0; 1< parts.length; i++) {
            String p = parts[i].toLowerCase().replaceAll(",.?!", "");
            parts[i] = p.substring(0, 1).toUpperCase() + p.substring(i);
           }
          return String.join("", parts);
      }
    }
