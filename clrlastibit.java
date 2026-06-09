public class clrlastibit {
    public static int clrithbit(int n,int i)
    {
        int bitmask=((~0)<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println("The Number after Clearing the ith bit is = "+clrithbit(15,2));
    }
}
