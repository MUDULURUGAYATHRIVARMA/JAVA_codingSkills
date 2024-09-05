public class sortornotarray {
    public static boolean sort(int [] arr)
    {
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr1={5,6,7};
        System.out.println(sort(arr1));
    }


}
