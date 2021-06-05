import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle\nSquare\nEnter the shape");
        String shape = sc.next();
        shape = shape.toLowerCase();
        if (shape.equals("circle")) {
            Circle c = new Circle();
            System.out.println("Enter the radius: ");
            int radius = sc.nextInt();
            c.calculateArea(radius);
        } else if (shape.equals("square")) {
            Square s = new Square();
            System.out.println("Enter the side: ");
            int side = sc.nextInt();
            s.calculateArea(side);
        } else {
            System.out.println("Invalid Input");
        }
    }

}
