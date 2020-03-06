/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab5;

import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ethan
 */

//

//Autoboxing

//


public class LargestNumbers {

    public static void main(String[] args) {
        
        
        Number[] ar = {45,3445.53,
            new BigInteger("3432323234344343101"),
            new BigDecimal("2.0909090989091343433344343")};

        ArrayList<Number> list = new ArrayList<Number>(Arrays.asList(
                new Number[] {new Integer(45),3445.53,
            new BigInteger("3432323234344343101"),
            new BigDecimal("2.0909090989091343433344343")}
        ));
        
        System.out.println("The largest number is "
                + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }
}
