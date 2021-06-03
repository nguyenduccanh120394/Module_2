
import java.util.*;

public class IntergerStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5,6,7,8,3};
        for (int i =0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        System.out.println("Before: "+stack);
        List<Integer>list=new ArrayList<>();
        while (stack.size()>0){
            list.add(stack.pop()) ;
        }
        System.out.println("After: "+list);
    }


}
