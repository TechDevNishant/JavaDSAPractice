import java.util.*;;
public class calculatorBySwitch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator\nEnter the Option According to Operation\n1.Addition\n2.Substration\n3.Multiplication\n4.Divison\n5.Modulus");
        int opt=sc.nextInt();
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        int result=0;
        switch (opt) {
            case 1:
                result=num1+num2;
                System.out.println("Sum of two Numbers is "+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("Difference of two Numbers is "+result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("Product of two Numbers is "+result);
                break;
            case 4:
                result=num1/num2;
                System.out.println("quotient of two Numbers is "+result);
                break;
            case 5:
                result=num1%num2;
                System.out.println("Modulus of two Numbers is "+result);
                break;
        
            default:
                System.out.println("Enter a valid option");
                break;
        }
        sc.close();
    }
    
}
