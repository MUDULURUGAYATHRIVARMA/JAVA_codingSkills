public class countdigits {
    public static void main(String[] args) {
        int a=98006,count=0;
        while(a!=0)
        {
            a=a/10;
            count++;

        }
        System.out.println(count);
    }
}
