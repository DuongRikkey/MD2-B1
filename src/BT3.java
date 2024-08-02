import java.util.Scanner;
public class BT3 {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        double CHUVI = (width + height) / 2;
        System.out.println("The area of the triangle is " + CHUVI);
        double S = width*height;
        System.out.println("The perimeter of the triangle is " + S);
    }
}
