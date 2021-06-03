public class Insertion_Sort {
    public static void main(String[] args) {
    int[]arr={2,1,3,9,5,8,7};
    sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int []arr){
        int x,pos;
        for (int i = 1 ; i < arr.length; i++) {
            x= arr[i];
            pos = i;
            while (pos>0&&x<arr[i-1]){
                arr[pos]=arr[pos-1];
                pos--;
            }
                arr[pos]=x;
        }
    }
}
