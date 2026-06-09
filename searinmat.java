import java.util.Scanner;
public class searinmat {
    public static void search(int arr[][],int k)
    {
        int f=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==k)
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("Search Success");
        }
        else{
            System.out.println("Search Unsuccessful");
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the elements in array");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Number to search");
        int k=sc.nextInt();
        search(arr,k);
     }
}
