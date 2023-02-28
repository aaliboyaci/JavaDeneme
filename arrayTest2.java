import java.util.*;

public class arrayTest2 {

    public static void main(String args[]) {

        String [] alphabeStrings = new String[]{"a","b","c","d","e"};
        int a_1 = 0, a_2 = 0, a_3 = 0, a_4 = 0, a_5 = 0, a_6 = 0, a_7 = 0, a_8 = 0, a_9 = 0, a_10 = 0;
        int b_1 = 0, b_2 = 0, b_3 = 0, b_4 = 0, b_5 = 0, b_6 = 0, b_7 = 0, b_8 = 0, b_9 = 0, b_10 = 0;
        int c_1 = 0, c_2 = 0, c_3 = 0, c_4 = 0, c_5 = 0, c_6 = 0, c_7 = 0, c_8 = 0, c_9 = 0, c_10 = 0;
        int d_1 = 0, d_2 = 0, d_3 = 0, d_4 = 0, d_5 = 0, d_6 = 0, d_7 = 0, d_8 = 0, d_9 = 0, d_10 = 0;
        int e_1 = 0, e_2 = 0, e_3 = 0, e_4 = 0, e_5 = 0, e_6 = 0, e_7 = 0, e_8 = 0, e_9 = 0, e_10 = 0;

        int[][] seats = new int[][] {
                { a_1, a_2, a_3, a_4, a_5, a_6, a_7, a_8, a_9, a_10 },
                { b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_10 },
                { c_1, c_2, c_3, c_4, c_5, c_6, c_7, c_8, c_9, c_10 },
                { d_1, d_2, d_3, d_4, d_5, d_6, d_7, d_8, d_9, d_10 },
                { e_1, e_2, e_3, e_4, e_5, e_6, e_7, e_8, e_9, e_10 }
        };

        

        //ekrana boş yerleri gösterme
        for (int k=0;k<11; k++){System.out.print(k + " ");} //üstte numaraları gösterme
        System.out.println();
        for (int i=0; i<seats.length ; i++){
            System.out.print(alphabeStrings[i] + " "); //solda harfleri gösterme
            for (int j = 0; j < seats[0].length; ++j) {

                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }


    }
}
