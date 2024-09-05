public class armstrong {
    public static void arm(int num)
    {
        int r,sum=0;
       int temp=num;
//        if(num==0)
//        {
//            return;
//        }
        while(num!=0)
        {
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("it is an armstrong number");

        }
        else
        {
            System.out.println("it is not an armstrong number");
        }

    }

    public static void main(String[] args) {

        arm(370);


    }
}
