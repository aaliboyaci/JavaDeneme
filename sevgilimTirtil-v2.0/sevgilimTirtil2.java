
import java.util.Scanner;

public class sevgilimTirtil2 {

    // beş seçim kısmı olacağı için beş adet method yazıyorum
    // olabilecek hemen hemen her durum için method oluşturup gerekli yerlerde o
    // methodları call etmeyi denedim.

    public static int question1(Scanner aInput) {
        System.out.println("Soru 1: Sevgilin bir tırtıl olsa onu sever miydin?" + "Evet = 1, Hayır = 2");

        int userDecision = aInput.nextInt();
        return userDecision;
    }

    public static int question2(Scanner aInput) {
        System.out.println(
                "Soru 2: Sevgilin bir tırtıl olarak kozaya giriyor sonrasında kozadan çıkana kadar onu sever miydin?"
                        + "Evet = 1, Hayır = 2");
        int userDecision = aInput.nextInt();
        return userDecision;
    }

    public static int question3(Scanner aInput) {
        System.out.println(
                "Soru 3: Sevgilin kozadan çirkin berbat kapkara bir kelebek olarak çıktı. Ona olan sevgin azalır mıydı?"
                        + "Evet = 1, Hayır = 2");
        int userDecision = aInput.nextInt();
        return userDecision;
    }

    public static int question4(Scanner aInput) {
        System.out.println("Soru 4: Sevgilin ölene kadar başka kızlara bakar mıydın?" + "Evet = 1, Hayır = 2");
        int userDecision = aInput.nextInt();
        return userDecision;
    }

    // soular ve seçimlerin dışında kalan durumların methodları

    public static void losingScenario() {// oyunun kaybedildiği senaryolarda kullanılacak method
        System.out.println("Oyunu kaybettin ve kendinden utanmalısın.");
    }

    public static int endingGame(Scanner aInput) { // oyun sonunda yeniden oynamak istiyor mu
        System.out.println("oyunu tekrar oynamak istiyor musun?");
        System.out.println("Tekrar oynamak için 1, çıkmak için 2 yaz ve enter'a bas");
        int replay = aInput.nextInt();
        return replay;
    }

    public static void winningScenario() {
        System.out.println("! ! ! ! ! ! TEBRİKLER ! ! ! !");
        System.out.println("Oyunu kazandın tebrikler, sevgiline olan bağlılığını kanıtladın!! ");
        System.out.println(" ");
    }

    /**
     * @param args
     */
    public static void main(String args[]) {

        boolean reloadGame = (true);
        boolean isTheGameOn = (true);
        Scanner userInput = new Scanner(System.in);

        // oyunun kendisi yani ana iskelet burada başlıyor
        // soruları/seçimleri ayrı methodalara böldüm
        // iç içe if else kullanmaktansa oyunu tek çizgi halinde devam eden ya da
        // kaybedince ana döngüyü bitiren bir formata soktum.
        // bu mantık ile ağaç gibi dallanma yapmadığım için çok daha karmaşık (daha
        // sonra yapmayı planladığım bandersnatch oyunu gibi),
        // aşırı kompleks dallandırmaları kolaylıkla yapabileceğimi fakettim. çünkü
        // aslında lineer bir hat oluşturabiliyorum böyle.
        while (reloadGame) {
            while (isTheGameOn) {

                System.out.println("");
                System.out.println("Sevgilim Tirtil Oyununa Hoşgeldin");
                System.out.println("Bu oyunda sevgiline karşı olan sevginin sınırları test edilecektir");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");

                int userDecision = question1(userInput); // birinci soru için methodu çağırdım
                if (userDecision == 2) {
                    losingScenario();
                    isTheGameOn = false;
                    break;
                }

                userDecision = question2(userInput); // ikinci soru için methodu çağırdım
                if (userDecision == 2) {
                    losingScenario();
                    isTheGameOn = (false);
                    break;
                }

                userDecision = question3(userInput); // üçüncü soru için methodu çağırdım
                if (userDecision == 2) {
                    winningScenario(); // burada hayır dendiğinde otomatik kazanıyor oyuncu (bilerek böyle yaptım)
                    isTheGameOn = (false);
                    break;
                }

                userDecision = question4(userInput); // dördüncü soru için methodu çağırdım
                if (userDecision == 1) {
                    losingScenario();
                    isTheGameOn = (false);
                    break;
                } else {
                    winningScenario();
                    isTheGameOn = (false);
                    break;
                }
            }

            // oyun bitti, tekrar oynamak istiyor mu, kullanıcıya soruyorum.
            int replay = endingGame(userInput);
            if (replay == 1) {
                reloadGame = true;
                isTheGameOn = true;
            } else {
                reloadGame = false;
            }
        }
    }

}
