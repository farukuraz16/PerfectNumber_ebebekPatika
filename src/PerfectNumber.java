import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.print("Please enter a number= ");
        int num= dat.nextInt();
        int sum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum==num) System.out.println(num+" is a Perfect Number!");
        else System.out.println(num+" is NOT a Perfect Number!");


    }
}
