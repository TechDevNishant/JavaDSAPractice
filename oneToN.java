import java.util.Scanner;
public class oneToN {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value of n");
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            sum=sum+count;
            count++;
        }
        System.out.print("Sum of First "+n+" natural Numbers is "+sum);
        sc.close();
    }
}