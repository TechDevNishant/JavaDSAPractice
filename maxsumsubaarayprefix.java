public class maxsumsubaarayprefix {
    public static void calcmaxsum(int arr[])
    {
        int pre[]=new int[arr.length];
        int largest=0;
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                sum=start==0?pre[end]:(pre[end]-pre[start-1]);
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
        calcmaxsum(arr);
    }
}
