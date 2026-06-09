public class reverseNum {
    public static void main(String[] args) {
        long n=10899;
        long rev=0;
        while(n>0){
            long digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }
        System.out.println("Reverse Of 10899 is "+rev);
    }
    
}
