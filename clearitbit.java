public class clearitbit {
    public static int clrithbit(int n,int i)
    {
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println("The Number after Clearing the ith bit is = "+clrithbit(10,1));
    }
}
