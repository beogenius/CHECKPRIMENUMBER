import java.util.Scanner;

public class CHECKPRIMENUMBER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " is not prime Number");
        }

        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " is Prime number");
            }
            else {
                System.out.println(number + " is not Prime number");
            }
        }
    }
}
