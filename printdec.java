public class printdec {
    public static void decr(int n)
        {
           if(n==1)
            {
                System.out.print(n);
                return; 
            }
            System.out.print(n+" ");
            decr(n-1);
        }
    public static void main(String[] args) {
       int n=10;
       decr(n);
    }
}
