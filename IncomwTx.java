import java.util.Scanner;
public class IncomwTx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income;
        System.out.println("Enter the Income");
        income=sc.nextInt();
        double tax;
        if(income<500000){
            tax=0.0;
        }
        else if((income>500000)&(income<1000000)){
            tax=(income*20)/100;
        }
        else{
            tax=(income*30)/100;
        }
        System.out.println("Tax is = "+tax);
        sc.close();
    }
}
