import java.util.Scanner;

public class PrimeNumbers {
    //If you are asked to find the 7th prime number, it’ll be 17 because the first 7 prime numbers are 2, 3, 5, 7, 11, 13, 17.
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int flag=0;
        for (int i = 2; i <= Integer.MAX_VALUE ; i++) {
            flag=0;
            for (int j = 2; j <i; j++) {
                if (i % j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println(" " + i);
                count--;
                if (count==0) {
                    break;
                }
            }

        }
    }
}
