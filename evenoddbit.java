import java.util.Scanner;
public class evenoddbit {
    public static void check(int n){
        int bitmask=1;
        if((n & bitmask)==1)
        {
            System.out.println("It is an Odd Number");
        }
        else{
            System.out.println("It is an Even Number");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        check(n);
        sc.close();
    }
}
