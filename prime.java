import java.util.*;
class prime {

    public static void main(String[] args) 
    {
         Scanner sc =new Scanner(System.in);
         int f=0;
         System.out.println("Enter the Number");
         int n=sc.nextInt();
         for(int i=2;i<=n-1;i++)
         {
            if(n%i==0)
            {
                f=1;
                break;
            }
 
         }
         if(f==1)
            {
               System.out.println("Not a Prime Number"); 
            }
         else{
                System.out.println("Prime Number");
            }
        sc.close();
    }    
}
