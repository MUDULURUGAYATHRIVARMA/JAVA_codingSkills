import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr= new int[5];
//        for(int i=0;i<5;i++)
//        {
//            arr[i]=s.nextInt();
//
//        }
        String s = sc.next();
         int [] hash1 = new int[256];
        for(int i=0;i<s.length();i++) {
            hash1[s.charAt(i) ] += 1;
        }
        int numbers=sc.nextInt();

        while(numbers>0)
        {
            char enter=sc.next().charAt(0);
            System.out.print(hash1[enter ] +" ");

        }

    }
}
