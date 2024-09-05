public class recursion2 {
    public static void fact(int n,int i,int f)
    {
        if(n==1 || n==0) {
            f *= i;
            System.out.println(f);
            return;
        }

        f*=i;
        fact(n-1,i+1,f);


    }

    public static void main(String[] args) {
        fact(0,1,1);
    }
}
