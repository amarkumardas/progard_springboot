import java.util.Scanner;

/*Return “Fizz”, “Buzz” or “FizzBuzz”.
For a given natural number greater zero return
● “Fizz” if the number is divisible by 3
● “Buzz” if the number is divisible by 5
● “FizzBuzz” if the number is divisible by both 3 and 5
● The number if it is not divisible by both 3 and 5
Test Cases
Input Result
1 1
2 2
3 Fizz
4 4
5 Buzz
6 Fizz
9 Fizz
10 Buzz
15 FizzBuzz
20 Buzz
30 FizzBuzz
75 FizzBuzz
*/
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range :");
        int l=sc.nextInt();
        System.out.println("Enter higher range: ");
        int h=sc.nextInt();
        for (int i = l; i <=h; i++) {
            if (i == 0) {
                System.out.println(0);
                return;
            }
            int count = 0;
            if (i % 3 == 0) {
                count = 1;
            }
            if (i % 5 == 0) {
                count = 2;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                count = 3;
            }
            if (count == 1) {
                System.out.println("FIZZ");
            } else if (count == 2) {
                System.out.println("BUZZ");
            } else if (count == 3) {
                System.out.println("FizzBuzz");
            } else if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
