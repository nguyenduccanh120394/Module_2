public class Practice_1 {
    static int[] list = {2, 8, 9, 12, 55, 222};

    static int find(int[] list, int value) {
        int low = 0;
        int hight = list.length - 1;
        while (hight>=low) {
            int mid = (low + hight) / 2;
            if (value < list[mid]) {
                 hight = mid - 1;
            } else if (value == list[mid] ) {
                return mid;
            } else {
                 low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(find(list,8));
        System.out.println(find(list,222));
    }
}