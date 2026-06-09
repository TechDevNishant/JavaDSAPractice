public class LinearSearch {
    public static void main(String[] args) {
        int marks[]={2,4,6,8,10,12,14,16};
        int key=10;
        int i,f=0;
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]==key)
            {
                f=1;
                break;
            }
        }
        if(f==1)
            {
              System.out.println("Element found at index "+i);
            }
        else
            {
                System.out.println("Element Not Found");
            }
        
    }
    
}
  