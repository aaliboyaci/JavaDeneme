public class arrayDisplayTest {

    public static void main(String args[]) {

        String a, b, c, d, e, _1, _2, _3, _4, _5, _6, _7, _8, _9, _10;
        String[][] seats = { { a = ("a"), b = "b", c = "c", d = "d", e = "e" }, { _1 = "o", _2 = "o", _3 = "o",
                _4 = "o", _5 = "o", _6 = "o", _7 = "o", _8 = "o", _9 = "o", _10 = "o", } };

        System.out.print("/ / ");
        for (int x = 0; x < seats[1].length; x++) {
            System.out.print((x + 1) + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < seats[0].length; ++i) {
            System.out.print(seats[0][i]);
            System.out.print(" / ");
            for (int j = 0; j < seats[1].length; ++j) {

                System.out.print(seats[1][j] + " ");
            }
            System.out.println(" / ");
            System.out.println("");
        }

        

    }

}
