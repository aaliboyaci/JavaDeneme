import java.util.Scanner;

public class denemeTest2 {


          public static int first()
            {
            System.out.print("burada bir secim yap 1 veya 2 ve entera bas:");
             Scanner userInput = new Scanner(System.in);
             int number = userInput.nextInt();
                return number;
            }

            
       
        public static void main(String args[]){
            
            int number = first();   //metoduçağır
             if (number == 1)
                    {
                    System.out.println("başarıyla çalıştı" );
                    }
            else {
                System.out.println("yarramı yedin");
                }


        }

        
        

    
}
