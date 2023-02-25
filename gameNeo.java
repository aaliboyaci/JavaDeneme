import java.util.Scanner;


public  class gameNeo {

    public static void main(String args[]){

       
        int baslatOyun,s1;
        String yolAyrimi=("Yol ayrımına geldin, bir karar vermen lazım.");
        String hataliSecim=("Hatali secim! 1 ya da 2'ye  bas.");
        String hikaye2=("hikaye2 yazi");
        String hikaye3=("hikaye3 yazi");
        
    
        System.out.println("Oyuna hoşgeldin");
        System.out.println("Buradan sonra her aşamada sana iki seçenek sunulacak ve bu seçeneklerde yapacağın seçimlere göre oyunun sonucu şekillenecek. Seçimlerini akıllıca yap");
        System.out.println("oyuna başlamak için bir 1 yaz ve entera bas");

        Scanner tus1  = new Scanner(System.in);
        baslatOyun = tus1.nextInt();

        switch (baslatOyun){
            case 1: 
            break;
            default: System.out.println(hataliSecim);
            break;
        
         }

        System.out.println("Hikaye 1 lorem ipsum");
        System.out.println(yolAyrimi);
        System.out.println("Seçimin x ise 1, seçimin y ise 2 yaz ve entera bas");
        s1 = tus1.nextInt();
        switch (s1){
            case 1: System.out.println(hikaye2);
            break;
            case 2: System.out.println(hikaye3);
            break;
            default :
            System.out.println(hataliSecim);
            break;
        }





    }
    
}
