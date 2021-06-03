public class Selection_Sort {
    public static void main(String[] args) {
        int []arr ={2,1,3};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[]arr){
       int min;
        for (int i = 0; i < arr.length; i++) {
            min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
                if (min!=i){
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }

            }
        }


    }
}
