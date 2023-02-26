import java.util.Scanner;

public class fibonacciLoop {

    public static void fibonaccifx(Scanner userInput) {
        int count, number1 = 0, number2 = 1;
        System.out.println("What number of fibonacci series do you want to see?:");
        // kullanıcıya kaçıncı sayıyı görmek istediğini soruyorum
        count = userInput.nextInt();

        int i = 1;
        while (i <= count) { // fibonacci serisinin matematik kısmı
            int sumOfTwoNumbers = number1 + number2;
            number1 = number2;
            number2 = sumOfTwoNumbers;
            i++;
        }
        System.out.println(" ");
        System.out.println("Number " + count + " of fibonacci series is=" + (number2 - number1));
        // seçilen x'inci sayıyı ekrana yazdırıyorum
        System.out.println(" ");
    }

    public static int playAgain(Scanner userInput) {
        // klasik programdan çık ya da devam et soru kısmı
        System.out.println(
                "If you want to see another number, type 1 and press Enter, if not then type 2 and press Enter");
        int playagain = userInput.nextInt();

        return playagain;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            fibonaccifx(scanner);
            int playagain = playAgain(scanner);
            if (playagain == 2) {
                break;
            }
        }
        scanner.close();
    }
}
