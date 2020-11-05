
public class AdvancedAstrology {

    public static void printStars(int number) {
        String stars = "";
        for (int i = 0; i < number; ++i) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        String spaces = "";
        for (int i = 0; i < number; ++i) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; ++i) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int width = (height * 2) - 1;
        
        String tree = "";
        
        int stars = 1;
        
        for(int i = 0; i < height; ++i) {
            
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printStars(1);
        System.out.println("---");
        printSpaces(1);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
