import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
      System.out.println("Linear equation");
      System.out.println("a * x+b=c");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        if(a!=0){
            double x=(c-b) / a;
            System.out.println("Nghiệm của phương trình là :" + x);}
          else{
              if(b==c)
              {
                  System.out.println("VSN");
              }
              else {
                  System.out.println("Ptvn");
              }
            }
        scanner.close();
    }
}

