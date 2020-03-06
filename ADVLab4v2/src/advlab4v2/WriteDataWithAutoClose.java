/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4v2;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Ethan
 */
public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
    File file = new java.io.File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    try (
      // Create a file
     PrintWriter output = new PrintWriter(file);
     
    ) 
    
    {
      // Write formatted output to the file
      output.print("John T Smith ");
      output.println(90);
      output.print("Eric K Jones ");
      output.println(85);
    }
  }
}
