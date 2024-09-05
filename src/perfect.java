public class perfect {
    public static void perf(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("it is perfect number");
        }
        else {
            System.out.println("it is not perfect number");
        }

    }

    public static void main(String[] args) {
        perf(28);

    }
}
