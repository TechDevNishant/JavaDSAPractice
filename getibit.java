public class getibit {
    public static int ithbit(int n,int i)
    {
        int bitmask=1<<i;
        if((n & bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("The second bit of 10 is = "+ithbit(10, 2));
    }
}
