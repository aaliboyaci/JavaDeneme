package loginSystemTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class loginSystem {

    public static void userCreate() {
        Scanner userScanner = new Scanner(System.in);
        Scanner userScanner2 = new Scanner(System.in);
        System.out.println("enter your user name");
        String userName = userScanner.nextLine();
        System.out.println("enter your password");
        String password = userScanner2.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("loginSystemTest/userdata.txt", true));

            writer.write("\n" + userName + " " + password);

            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static boolean userLogin() {
        Scanner userScanner = new Scanner(System.in);
        Scanner userScanner2 = new Scanner(System.in);
        System.out.println("enter your user name");
        String userName = userScanner.nextLine();
        System.out.println("enter your password");
        String password = userScanner2.nextLine();
        boolean loginSuccess = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("loginSystemTest/userdata.txt"))) {
            int x = userName.length();
            String testName;
            while ((testName = reader.readLine()) != null) {
                if ((userName).equals(testName.substring(0, x))) {
                    System.out.println("User name is matched, " + "password will be authenticated");
                    int y = testName.length();
                    if (password.equals(testName.substring(x + 1, y))) {
                        System.out.println("password is correct, login succesful");
                        loginSuccess = true;
                        break;
                    } else {
                        System.out.println("password is incorrect");
                        userLogin();
                    }
                    break;
                }

            }

            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return loginSuccess;
    }

    /**
     * @param Args
     */
    public static void main(String Args[]) {
        while (true) {
            System.out.println("login (1), create (2)? ");
            Scanner userScanner = new Scanner(System.in);
            int userInput = userScanner.nextInt();
            if (userInput == 1) {
                boolean loginSuccess = userLogin();
                if (loginSuccess == true) {
                    System.out.println("++ login succesful");
                    break;

                } else {
                    System.out.println("-- login unsuccesful");
                }
            }

            if (userInput == 2) {
                userCreate();
            }

        }
    }
}
