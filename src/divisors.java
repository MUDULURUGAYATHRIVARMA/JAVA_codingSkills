public class divisors {
    public static void div(int a)
    {
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        div(200);
    }
}
