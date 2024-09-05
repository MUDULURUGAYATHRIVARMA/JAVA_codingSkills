public class towerofhonai2
{
    public static void tower(int n,String s,String a,String d )
    {
        if(n==1)
        {
            System.out.println("transfer  "+n+"from  "+s+"to  "+d );
            return;
        }
        tower(n-1,s,d,a);
        System.out.println("transfer  "+n+"from "+s+"to "+d);
        //tower(1,s,a,d);
        tower(n-1,a,s,d);
    }

    public static void main(String[] args) {
        tower(3,"S","A","D");
    }
}