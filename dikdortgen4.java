import java.util.Scanner;


public class dikdortgen4 {

    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        Scanner secim = new Scanner(System.in);
        String x = "+";
       int a;
       int b;
       int karar;
       

       //Kullanıcıya hangi şekli istediğini sormak
       System.out.println("Ne çizdirmek istiyorsun?");
        System.out.println("Kare için 1 yaz, Dikdörtgen için 2 yaz");

        karar = secim.nextInt();

        //kullanıcı kararına göre programın yapacağı seçim
        if ( karar == 1) {

            System.out.println("Kenar uzunlugunu yaz");
            a = sayi.nextInt();
            b=a;
        
        }
        else {
            System.out.println("Sırayla iki kenar uzunlugunu yaz");
            a = sayi.nextInt();
            b = sayi.nextInt();
        }


        // Kare Ya da şekli yazdırmaya başlanan kısım
        for (int i=0; i<(a); i++){

            System.out.println();
            
            for (int j=0; j<(b); j++){

                
                if ((i == 0) || (i == (a-1))){ 
                    System.out.print(x);
                }
                else if ((j==0) || (j==(b-1)) ) {
                    System.out.print(x);

                }
                else {

                    System.out.print(" ");
                }
                
            }
            }
        }
    }    

