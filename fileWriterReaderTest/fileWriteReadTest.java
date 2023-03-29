package fileWriterReaderTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class fileWriteReadTest {

  public static Scanner userScanner = new Scanner(System.in);;

  public static void writeRead() {

    System.out.println("öğrenci adını gir");
    String studentName = userScanner.nextLine();

    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("fileWriterReaderTest/output.txt", true));

      writer.write("\n" + studentName);

      writer.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try (BufferedReader reader = new BufferedReader(new FileReader("fileWriterReaderTest/output.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      writeRead();
    }

  }
}
