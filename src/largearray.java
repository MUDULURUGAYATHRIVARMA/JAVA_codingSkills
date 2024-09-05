import java.sql.SQLOutput;

public class largearray {
    public static int large(int [] arr)
    {
        int i;
        int first=arr[0];
        int second=arr[1];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<first)
            {
              second=first;
              first=arr[i];


            }
            else if(arr[i]<second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        return first ;

    }

    public static void main(String[] args) {
        int [] arr={59,93,84,110};
        System.out.println("largest number :" +large(arr));

    }
}
