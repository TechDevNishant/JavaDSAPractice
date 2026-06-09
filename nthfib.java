public class nthfib {
    public static int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int fib=fib(n-1)+fib(n-2);
        return fib;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(fib(n));
    }
}
