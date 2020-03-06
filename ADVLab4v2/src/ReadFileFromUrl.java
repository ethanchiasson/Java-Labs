
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ethan
 */
public class ReadFileFromUrl {

    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
                System.out.println(line);
            }

            System.out.println("The file size is " + count + " bytes");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("IO Errors");
        }
    }
}