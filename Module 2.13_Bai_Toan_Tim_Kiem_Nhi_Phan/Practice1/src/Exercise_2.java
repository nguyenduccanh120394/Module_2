import java.util.*;

public class Exercise_2 {
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int n1 = scanner.nextInt();
        System.out.println("Enter number 2 ");
        int n2 = scanner.nextInt();
        System.out.println("Enter number 3 ");
        int n3 = scanner.nextInt();
        System.out.println("Enter number 4 ");
        int n4 = scanner.nextInt();
        int[] arr={n1,n2,n3,n4} ;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            list.add(arr[i]);
        }
        System.out.println("================");
        Collections.sort(list);
        System.out.println("Enter value u want find");
        int value = scanner.nextInt();
        System.out.println(search(list,0,list.size()-1,value));
        }
    public static int search(List<Integer>list,int low,int hight,int value){
        if (hight>=low){
            int mid = (low+hight)/2;
            if (list.get(mid)==value){
                return mid;
            }
            if (list.get(mid)>value){
                return search(list,low,mid-1,value);
            }if (list.get(mid)<value){
                return search(list,mid+1,hight,value);
            }
        }
        return -1;
    }

}
