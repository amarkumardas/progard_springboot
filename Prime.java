import java.util.Scanner;

public class Prime {

//You are given a number 'N'. Your task is to find Nth prime number.
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        for (int i = 2; i <= num ; i++) {
            flag=0;
            for (int j = 2; j <i; j++) {
                if (i % j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.println(" "+i);

        }
    }
}
