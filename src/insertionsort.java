public class insertionsort {



        public static void printArray(int arr[]) {
            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


        public static void main(String args[]) {
            int arr[] = {7, 8, 1, 3, 2};


            //insertion sort
            for(int i=1; i<arr.length; i++) {
//                int current = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j] > arr[i]) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = arr[i];
            }
            printArray(arr);
        }
    }

