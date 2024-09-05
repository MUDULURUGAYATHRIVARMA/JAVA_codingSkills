public class gcd {
    public static int gcdnum(int a,int b)
    {

        while(a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int result=gcdnum(20,15);
        System.out.println(result);

    }
}
