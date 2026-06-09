public class maxsubarraysum {
    public static void subarr(int arr[])
    {
        int largest=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum=sum+arr[k];
                    
                }
                System.out.println(sum);
                if(sum>largest)
                    {
                        largest=sum;
                    }
                
            }
            
        }
        System.out.println("Max Sum of Subarray is = "+largest);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarr(arr);
    }
}
