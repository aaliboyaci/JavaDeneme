package cinemaTicketSystem;

import java.util.*;

public class cinemaTicketSystem {

    // ekrana koltukları gösteren method
    public static void showSeats(int[][] seats, String[] alphabeStrings, int columnSize) {
        System.out.println();
        System.out.println("----SCREEN IS HERE----");
        System.out.println();

        for (int k = 0; k <= columnSize; k++) {
            if (k >= 10) {
                System.out.print(k + " ");
            } // bu hareketin tek amacı iki basamaklı sayıların görsel olarak düzgün
              // görünmesini sağlamak
            else {
                System.out.print(k + "  ");
            }

        } // üstte numaraları gösterme
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print(alphabeStrings[i] + "  "); // solda harfleri gösterme
            for (int j = 0; j < seats[0].length; ++j) {

                System.out.print(seats[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // tüm değerleri topluyorum ki boş yer var mı bileyim
    public static int checkAvailabilty(int[][] seats) {
        int sum = 0;
        int sumOfRow[] = new int[seats.length];
        for (int i = 0; i < seats.length; i++) {

            for (int num : seats[i]) {
                sum = sum + num;
            }
            sumOfRow[i] = sum;
        }
        return sum;
    }

    public static int seatChoose(Scanner userScanner, int[][] seats, int columnSize, int rowSize,
            String[] alphabeStrings) {

        int row, column;
        // kullanıcı yanlışdeğer girerse diye tekrar başa atsın istiyorum. minik bir
        // error kontrol yöntemi
        while (true) {
            System.out.println();
            System.out.println("Which seat you want to choose?");
            System.out.println();

            // zurnanın zırt dediği yer // kullanıcıdan giriş al ve hücre değeri değiştir

            System.out.println("Which row ");
            for (int u = 0; u < rowSize; u++) {
                System.out.print(alphabeStrings[u] + ","); // burası sadece "soru için" girilen sayı kadar harf ekrana
                                                           // yazdırmak
            }
            System.out.print("("); // örnek row 2 yazdığında a,b (a=0,b=1) diyecek
            for (int o = 0; o < rowSize; o++) {
                System.out.print(alphabeStrings[o] + "=" + o + ", ");
            }
            System.out.print(")?");
            row = userScanner.nextInt();
            System.out.print("Which column ");
            for (int f = 0; f < columnSize; f++) {// bunun olayı da ekrana sorulacak sorunun kullanıcı verisine göre
                                                  // değişecek olması
                System.out.print(f + 1 + " ");
            }
            System.out.println("?");
            column = userScanner.nextInt() - 1;

            // error kontrol yapıyorum user farklı değer girerse eğer diye
            if (row > rowSize || column > columnSize) {
                System.out.println();
                System.out.println("!!! False input, Try again !!!");
                System.out.println();
            } else {
                break;

            }
        }

        // satır sütunu güncelle
        seats[row][column] = 1;
        return seats[row][column];
    }

    public static int checkConditions(int sum) {
        int systemBreak = 0;
        if (sum == 50) {
            System.out.println(
                    "We're sorry, All the seats are taken. There are no seats available for this movie.");
            System.out.println(" ");
            systemBreak = 1;
        } else {
            System.out.println("There are seats available for this movie.");
            System.out.println("Here you can choose place to sit. 0 = seat is free, 1 = seat is taken");
            System.out.println();
        }
        return systemBreak;
    }

    public static void main(String args[]) {
        Scanner userScanner = new Scanner(System.in);

        Boolean restart = true;

        System.out.println(" ");
        System.out.println("WELCOME TO THE CINEMA SEAT SYSTEM ! ! !");
        System.out.println(" ");
        // kullanıcı sinema salonun boyutunu seçsin

        int rowSize;
        do {
            System.out.println("Please enter the row size of the cinema (MAX value is 8): ");
            System.out.println();
            rowSize = userScanner.nextInt();
        } while (rowSize >= 8); // error kontrol mekanizması

        System.out.println("Please enter the column size of the cinema (no maximum value, but be considerable :) ): ");
        System.out.println();
        int columnSize = userScanner.nextInt();
        String[] alphabeStrings = new String[] { "a", "b", "c", "d", "e", "f", "g", "h" };

        // yeni arraylist
        int[][] seats = new int[rowSize][columnSize];
        // her variable 0 değeri initalize etme //burası çokomelli
        for (int r = 0; r < rowSize; r++) {
            for (int t = 0; t < columnSize; t++) {
                seats[r][t] = 0;
            }
        }

        while (restart) {
            int sum = checkAvailabilty(seats);
            System.out.println();
            System.out.println((columnSize * rowSize) - sum + " seats left for this movie.");
            int systemBreak = checkConditions(sum);
            if (systemBreak == 1) {
                restart = false;
            }
            System.out.println("");

            showSeats(seats, alphabeStrings, columnSize);

            seatChoose(userScanner, seats, columnSize, rowSize, alphabeStrings);

            System.out.println("Your seat has reserved, now.");
            System.out.println("Enjoy the movie");
            System.out.println();

        }
    }
}
