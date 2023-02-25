import java.util.Scanner;


public class kosullarTest {
    public static void main(String args[]){

        boolean keepOn=(true);
        Scanner input = new Scanner(System.in);
        while(keepOn){
            
            double no1, no2;
            int gameExit;

         System.out.println("birinci sayi gir");
          no1 = input.nextDouble();

         System.out.println("ikinci sayi gir");
         no2 = input.nextDouble();

         if (no1 > no2){ 
            System.out.println("birinci sayi ikinci sayidan büyük");
        
          } 
           else if(no1 == no2 ){
            System.out.println("iki sayı birbirine eşit");

           }
          else {

            System.out.println("ikinci sayi birinci sayidan büyük");
          }       
           System.out.println("programdan çıkmak için 1, tekrar başlamak için herhangi bir sayı yaz ve entera bas");
         gameExit = input.nextInt();
         if (gameExit == 1){
            keepOn = false;
        
         }
        }
         input.close();
    }
}
