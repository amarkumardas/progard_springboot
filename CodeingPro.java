import java.util.Scanner;
import java.util.Stack;

/*Take an input string with X opening brackets [ and Y closing brackets ], in a random order.
Determine if the generated string of brackets is balanced, that is it consists of pairs of opening/closing brackets in the
correct order with no matched opening and closing pairs.
The kata has been structured to be simple, yet loosely guided. You will need to make decisions just like you were
writing code for production.
The examples are not meant to guide your implementation, they are there merely to give examples.
Do not worry about input other than brackets and empty string.
Examples
(empty) “”
[] OK
[][] OK
[[]] OK
[[[][]]] OK
][ FAIL
][][ FAIL
[][]][ FAIL
*/
public class CodeingPro {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        Stack<Character> stack = new Stack<>();
            for (char c : arr) {
                if (c == '[') {
                    stack.add(c);
                } else {
                    if (stack.isEmpty()) {
                        System.out.println("FAIL1");
                        return;
                    }else{
                            char top = stack.peek();
                            if (c == ']' && top == '[') {
                                stack.pop();
                            }
                        }
                    }
                }
        if (stack.isEmpty()){
            System.out.println("OK");
        }else {
            System.out.println("FAIL");
        }
    }
}
