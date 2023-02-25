import java.util.Scanner;


public class toplama {
 /**
 * @param args
 */


public static void main(String args[])   {

        Scanner input  = new Scanner(System.in);
        double s1, s2, answer;
        String isim, soyisim;
        System.out.println("ilk sayıyı yaz");
        s1 = input.nextDouble();
        System.out.println("ikinci sayıyı yaz");
        s2 = input.nextDouble();
        answer = s1 + s2;
        System.out.println(answer);
        input.close();

}
}
