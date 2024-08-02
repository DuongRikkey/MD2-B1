import java.util.Scanner;
public class BT4 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();

        double BINHPHUONG = Math.pow(a,2);
        double LAPPHUONG = Math.pow(a,3);
        System.out.println("LAPPHUONG: "+LAPPHUONG);
        System.out.println("BINHPHUONG: "+BINHPHUONG);

    }
}
