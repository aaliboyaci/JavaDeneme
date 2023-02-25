
    import java.util.Scanner;
    public class fibonacciLoop {

    public static void main(String[] args) {
        boolean replay=true;
        while(replay){
        int count, number1 = 0, number2 = 1;
        System.out.println("What number do you want to see in the fibonacci series?:"); //kullanıcıya kaçıncı sayıyı görmek istediğini soruyorum
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        int i=1;
        while(i<=count)
        {   //fibonacci serisinin matematik kısmı
            int sumOfTwoNumbers = number1 + number2;
            number1 = number2;
            number2 = sumOfTwoNumbers;
            i++;
        }
        System.out.println(" ");
        System.out.println("Number " + count +  " of fibonacci series is=" + (number2 - number1));//seçilen x'inci sayıyı ekrana yazdırıyorum
        System.out.println(" ");
        
        //klasik programdan çık ya da devam et soru kısmı
        System.out.println("If you want to see another number, type 1 and press Enter, if not then type 2 and press Enter");
        int playagain = scanner.nextInt();
        if (playagain == 1){
        }
        else{
            replay = false;
        }

    }}
}
