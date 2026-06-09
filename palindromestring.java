import java.util.Scanner;
public class palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.next();
        int l=str.length();
        String str2=new String();
        for(int i=l-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            str2=str2+ch;
        }
        System.out.println("Reverse of the String is = "+str2);
        if(str.equals(str2))
        {
            System.out.println("Given String is a Palindrome String");
        }
        else
        {
            System.out.println("Given String is not a Palindrome String");
        }
        sc.close();
    }
}
