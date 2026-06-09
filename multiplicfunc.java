import java.util.Scanner;
public class multiplicfunc {
    public static int calprod(int num1,int num2){
        int prod=num1*num2;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Products Of The Numbers is = "+calprod(a,b));
        sc.close();
    }
}
