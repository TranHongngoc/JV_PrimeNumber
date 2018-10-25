import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (num < 2){
            System.out.println("This number is NOT prime number");
        }else if (num == 2){
            System.out.println("This number is Prime number");
        }else{
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("The Number is prime number");
            }else System.out.println("The number is NOT prime number");
        }
    }
}
