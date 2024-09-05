import java.util.*;
public class arr {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        for (int i = 3-1; i >= 2; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[2] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

}
