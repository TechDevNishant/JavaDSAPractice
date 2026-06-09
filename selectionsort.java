public class selectionsort 
{
    public static void sort(int arr[])
    {
        int m=arr.length;
       
        for(int i=0;i<m-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<m;j++)
            {
               if(arr[minpos]>arr[j])
               {
                minpos=j;
               }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            
        }
        System.out.print("Sorted Array is = ");
        for(int i=0;i<m;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);

    }
    
}
