
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String stars = "";
        for (int i = 0; i < number; ++i) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSquare(int size) {
        String square = "";
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                square += "*";
            }
            square += "\n";
        }
        System.out.println(square);
    }

    public static void printRectangle(int width, int height) {
        String rectangle = "";
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                rectangle += "*";
            }
            rectangle += "\n";
        }
        System.out.println(rectangle);
    }

    public static void printTriangle(int size) {
        String triangle = "";
        for(int i = 1; i <= size; ++i) {
            for(int j = 1; j <= i; ++j) {
                triangle += "*";
            }
            triangle += "\n";
        }
        System.out.println(triangle);
    }
}
