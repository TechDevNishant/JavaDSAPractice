import java.util.Scanner;
public class shortestpathstring {
    public static double calcdistance(int x,int y)
    {
        double shortestdistance=Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
        return shortestdistance;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.next();
        int l=str.length();
        int x=0;
        int y=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='E')
            {
                x++;
            }
            else if(ch=='W')
            {
                x--;
            }
            else if(ch=='N')
            {
                y++;
            }
            else if(ch=='S')
            {
                y--;
            }
        }
        System.out.print("Shortest Distance is = ");
        System.out.println(calcdistance(x,y));
        sc.close();
}
}
