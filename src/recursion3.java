public class recursion3 {
    public static void fib(int n,int n1,int n2)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n1+" ");
        fib(n-1,n2,n1+n2);
    }

    public static void main(String[] args) {
        fib(10,0,1);
    }
}
