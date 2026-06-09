import java.util.*;
public class LargestAmongThree{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter First Number");
      int num1=sc.nextInt();
      System.out.println("Enter Second Number");
      int num2=sc.nextInt();
      System.out.println("Enter Third Number");
      int num3=sc.nextInt();
      if(num1>num2)
      {
         if(num1>num3){
            System.out.println("First Number is Greatest");
         }
         else if(num3>num1){
            System.out.println("Third Number is Greatest");

         }
      }
      else{
         System.out.println("Second number is largest");
      }
      sc.close();
      }
}
