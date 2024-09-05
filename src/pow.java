public class pow {
    public static int po(int x, int n)
    {
       if(n==0)
       {
       return 1;
       }
       if(x==0)
       {
           return 0;
       }
        int x3=po(x,n-1);
        int x2=x*x3;
         return x2;
    }
    public static void main(String args[]) {
        //int x = 3, n = 3;
       //int result = po(3,3);
        System.out.println(po(3,3));

    }

}
