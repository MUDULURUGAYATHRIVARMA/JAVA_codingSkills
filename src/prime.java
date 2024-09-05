public class prime {
    public static void main(String[] args) {
        int n=169,sum,count=0,i;
        for (i=1;i<=n;i++)
        {
            sum=n%i;
            if (sum==0)
            {
                count++;
            }
        }
        if(count<=2)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
