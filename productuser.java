import java.util.Scanner;

public class productuser {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        int prod =a*b;
        System.out.println("Product of Entered Numbers is "+prod);
        sc.close();
    }
    
}
