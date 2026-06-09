import java.util.Scanner;
public class LargestAmongTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the Second number");
        b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
         System.out.println(b+" is greater than "+a);   
        }
        sc.close();
    }
}
