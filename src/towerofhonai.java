public class towerofhonai {
    public static void tower(int n,String s,String a,String d)

    {
        if(n==0)
        {
           //tower(n,s,a,d);
            //System.out.println("transfer"+n+"from"+s+"to"+d);
            return;

        }
        tower(n-1,s,d,a);
        System.out.println("transfer"+n+"from"+s+"to"+d);
        tower(n-1,a,s,d);
        //System.out.println("transfer"+n+"from"+a+"to"+d);

    }

    public static void main(String[] args) {
        tower(3 ,"S","A","D");
//        transfer disk 1 from S to D
//        transfer disk 2 from S to D
//        transfer disk 1 from D to A
//        transfer disk 3 from S to A
//        transfer disk 1 from A to S
//        transfer disk 2 from A to S
//        transfer disk 1 from S to D

    }
}