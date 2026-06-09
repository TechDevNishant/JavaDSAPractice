import java.util.Scanner;
public class sumfuncswap {
    public static int calsum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void swapno(int a,int b){
            int temp=a;
            a=b;
            b=temp;
            System.out.println("The Values After Swapping: A="+a+" and B="+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The Values Before Swapping: A="+a+" and B="+b);
        System.out.println("Sum Of The Numbers is = "+calsum(a,b));
        swapno(a,b);
        
        sc.close();
    }
}
