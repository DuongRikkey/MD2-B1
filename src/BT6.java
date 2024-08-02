import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.println(a + b + c);
        System.out.println((a + b + c)/3);

    }
}
