public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {2,1,3};
        System.out.println("Array before sort :");
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Array after sort :");
        sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print (list[i]+" ");
        }
    }
    static  void sort(double []list){
        int min;
        for (int i = 0; i <list.length ; i++) {
            min = i;
            for (int j = i+1; j < list.length ; j++) {
                if (list[j]<list[min]){
                    min = j;
                }
            }
            if (min!=i){
                    int temp = (int) list[min];
                    list[min]=list[i];
                    list[i]=temp;
                }
        }
    }
}
