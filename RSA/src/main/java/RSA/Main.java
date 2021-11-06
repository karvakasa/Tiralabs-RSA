/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSA;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author totato
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
        try {
      File publicKey = new File("heippa.txt");
      Scanner myReader = new Scanner(publicKey);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
        } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
        }
        try {
      File privateKey = new File("moi.txt");
      Scanner myReader = new Scanner(privateKey);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
        } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
        }
        
      // Enter data using BufferReader
      BufferedReader reader = new BufferedReader(
          new InputStreamReader(System.in));
        
      // Reading data using readLine
      String name = reader.readLine();
        
      // Printing the read line
        for (String arg : args) {
            System.out.println(arg);
            System.out.println("moi");
        }
    
    }
}
