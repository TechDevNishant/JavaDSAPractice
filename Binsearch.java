public class Binsearch {
    public static int getindex(int arr[],int k){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end)
        {
           mid=(start+end)/2;
           if(arr[mid]==k)
           {
             return mid;
           }
           else if(arr[mid]>k)
           {
            end=mid-1;
           }
            else if(arr[mid]<k)
           {
            start=mid+1;
           }
        }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int key = 10;
        System.out.println("Index for key is = "+getindex(numbers, key));

    }
    
}
