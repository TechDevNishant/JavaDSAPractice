public class traprain {
    public static void watertrap(int arr[])
    {
        int sum=0;
        int m=arr.length;
        int leftmax[]=new int [m];
        int rightmax[]=new int[m];
        for(int i=0;i<m;i++)
        {
            if(i==0)
            {
                leftmax[0]=0;
            }
            else{
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            if(i==(m-1))
                {
                    rightmax[m-1]=0;
                }
            else
            {
              rightmax[i]=Math.max(arr[i],rightmax[i+1]);
            }
        }
        for(int i=0;i<m;i++)
        {
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
        int trappedwater=waterlevel-arr[i];
        sum=sum+trappedwater;
        }
        System.out.println("Total amount of water trapped = "+sum);

    }
    public static void main(String[] args) {
        int arr[]={3,0,1,0,4,0,2};
        watertrap(arr);
    }
}
