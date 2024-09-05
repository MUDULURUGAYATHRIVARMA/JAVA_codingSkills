public class powerofnumber {
    public static void main(String [] args)
    {
        int exp=3,base=5,res=1,i=1;
        while(i<=exp)
        {
            res=res*base;
            i++;
        }
        System.out.println("the root of 5 is : " +res);
    }
}
