public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={8, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        sort2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void sort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    }
                }
        }
    }
    static void sort2(int[]arr){
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
            needNextPass=false;
            for (int j = arr.length-1; j >= i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                    needNextPass = true;
                }
            }
        }
    }


