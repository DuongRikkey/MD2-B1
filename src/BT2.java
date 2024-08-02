import java.util.Scanner;
public class BT2 {
    public static void main(String[] args) {
    double Rate=23000;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter USA");
    double USA=sc.nextDouble();
    double VND=USA*Rate;
    System.out.println("VND:"+VND);
    }
}
