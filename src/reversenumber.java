public class reversenumber {
    public static void main(String[] args) {
        int r,sum=0,a=321;
        while(a!=0)
        {
            r=a%10;
            sum=sum*10+r;
            a=a/10;
        }
        System.out.println(sum);
    }
}
