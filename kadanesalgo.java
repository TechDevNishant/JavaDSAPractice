public class kadanesalgo {
    public static void calmax(int arr[])
    {
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<arr.length;i++)
        {
                currsum+=arr[i];
                if (currsum<0) {
                    maxsum=0;
                    currsum=0;
                }
                else
                {
                    if(currsum>maxsum)
                    {
                        maxsum=currsum;
                    }
                }
        }
        System.out.println("Max Sum of Subarray is = "+maxsum);
        }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        calmax(arr);
    }
}
