import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack<String>stack= new Stack<>();
        String str = "Dayla1chuoi";
        System.out.println("Tach word tu String");
        String[] word = str.split("");
        System.out.println("Before: ");
        for (int i = 0; i < word.length; i++) {
            stack.push(word[i]);
        }
        System.out.println(stack);
        System.out.println("After: ");
        List<String>list=new ArrayList<>();
        while (stack.size()>0){
            list.add(stack.pop());
        }
        System.out.println(list);
    }
}
