/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4v2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class ReplaceText {

    public static void main(String[] args) throws Exception {
        
        args = new String[] {"scores.txt", "scores3.txt", "88", "100"};
        // Check command line parameter usage
        if (args.length != 4) {
            System.out.println(
                    "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        // Create input and output files
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);

        while (input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            output.println(s2);
        }

        input.close();
        output.close();
    }
}
