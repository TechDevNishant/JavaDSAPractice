import java.util.*;
class Circlearea {

    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        int a=sc.nextInt();
        float area= 3.14f*a*a;
      
        System.out.println("Area of The Circle is "+area);
        sc.close();
    }    
}