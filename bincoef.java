import java.util.Scanner;
public class bincoef {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static float bincof(int n,int r){
          float binc=factorial(n)/(factorial(r)*factorial(n-r));
          return binc;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n=");
        int n=sc.nextInt();
        System.out.println("Enter r=");
        int r=sc.nextInt();
        System.out.println(" Binomial Coefficient(nCr) is = "+bincof(n,r));
        sc.close();
    }
}
