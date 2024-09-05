import java.util.*;

public class removearray {
    public static int rem(int[] a)
    {
        Arrays.sort(a);

        int j=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[j]!=a[i]){
                j++;
                 a[j]=a[i];
            }
        }
       return j+1;

    }

    public static void main(String[] args) {
        int [] arr={0,1,2,0,1,2,0,1,2,0,1,2};
        int r=rem(arr);

        for(int i=0;i<r;i++)
        {
            System.out.print(arr[i]+" ");

        }
    }
}
