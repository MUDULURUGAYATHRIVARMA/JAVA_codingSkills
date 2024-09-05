import java.util.Arrays;

public class findduplicates {
    public static void find(int [] arr)
    {
        int j=0;
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++)
        {

           if(arr[j]==arr[i])
           {
               System.out.print(arr[j]);
           }
           j++;
        }

    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,1,2,3  };
        find(arr);
    }

}
