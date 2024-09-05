public class palindrom {
     public static void palin(int num)
     {
         int r,sum=0,temp=num;
         while(num!=0)
         {
             r=num%10;
             sum=(sum*10)+r;
             num=num/10;

         }
         if (temp==sum)
         {
             System.out.println("it is palindrom");
         }
         else
         {
             System.out.println("it not an palindrom");
         }
     }

    public static void main(String[] args) {
        palin(127);
    }
}
