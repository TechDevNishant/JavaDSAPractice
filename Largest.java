public class Largest {
    public static int largestfunc(int arr[])
    {
        int largest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        System.out.println("Largest Number in array is=>"+largestfunc(arr));
    }
}
