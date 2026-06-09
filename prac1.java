public class prac1 {
    public static int prin(int n)
    {
        if(n==1){
            
        }
        System.err.println(prin(n-1));
    }
    public static void main()
    {
        int n=10;
        prin(n);
    }
}
