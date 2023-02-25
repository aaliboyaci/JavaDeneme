import java.util.Scanner;



public class ortalamaHesap {
    
    /**
     * 
     */
    public static void main(String args[]){

        Scanner kullaniciGiris = new Scanner (System.in);



        System.out.println("Ders Ortalaması Hesaplayan Program");

        int matematik, fizik, kimya, biyoloji, edebiyat;
        double toplam, sonuc;
        String temelYazi=("Bu dersin notunu giriniz (0-100 arası değer olarak) ve Enter'a basınız;");

        System.out.println(temelYazi + "Matematik");
        matematik = kullaniciGiris.nextInt();
        System.out.println(temelYazi + "Fizik");
        fizik = kullaniciGiris.nextInt();
        System.out.println(temelYazi + "Kimya");
        kimya = kullaniciGiris.nextInt();
        System.out.println(temelYazi + "Biyoloji");
        biyoloji = kullaniciGiris.nextInt();
        System.out.println(temelYazi + "Edebiyat");
        edebiyat = kullaniciGiris.nextInt();

        toplam = (matematik + fizik + kimya + biyoloji + edebiyat);
        sonuc = (toplam / 5);

        if ((sonuc > 60) && (sonuc <= 100)){
            System.out.println("Derslerinizin not ortalaması = " + sonuc + " ve başarılı olarak geçtiniz. Notunuz A");

         }
            else if ( (sonuc <= 59  ) && (sonuc > 40 ) ){

                System.out.println("Derslerinizin not ortalaması = " + sonuc + " ve sorumlu olarak geçtiniz. Notunuz B, Bütünleme hakkınız var.");

            }
            else if ( (sonuc <= 39  ) && (sonuc > 20 ) ){

                System.out.println("Derslerinizin not ortalaması = " + sonuc + " ve kaldınız. Notunuz C, Fakat bütünleme hakkınız var.");
            }

            else  {

                System.out.println("Derslerinizin not ortalaması = " + sonuc + " ve kaldınız.Notunuz D, Bütünleme hakkınız yok.");
            }
        

    }

}
