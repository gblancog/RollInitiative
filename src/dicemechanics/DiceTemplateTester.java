/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicemechanics;

/**
 *
 * @author Gorka
 */
public class DiceTemplateTester {
    
    public static void main(String[] args) {
        DiceTemplate myDiceTemplate = DiceTemplate.getTemplate();
        
        int value1;
        int value2;
        int value3;
        int value4;
        
        // 2-face dice testing...
        value1 = myDiceTemplate.rollDice2();
        value2 = myDiceTemplate.rollDice2();
        value3 = myDiceTemplate.rollDice2();
        value4 = myDiceTemplate.rollDice2();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 3-face dice testing...
        value1 = myDiceTemplate.rollDice3();
        value2 = myDiceTemplate.rollDice3();
        value3 = myDiceTemplate.rollDice3();
        value4 = myDiceTemplate.rollDice3();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 4-face dice testing...
        value1 = myDiceTemplate.rollDice4();
        value2 = myDiceTemplate.rollDice4();
        value3 = myDiceTemplate.rollDice4();
        value4 = myDiceTemplate.rollDice4();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 6-face dice testing...
        value1 = myDiceTemplate.rollDice6();
        value2 = myDiceTemplate.rollDice6();
        value3 = myDiceTemplate.rollDice6();
        value4 = myDiceTemplate.rollDice6();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 8-face dice testing...
        value1 = myDiceTemplate.rollDice8();
        value2 = myDiceTemplate.rollDice8();
        value3 = myDiceTemplate.rollDice8();
        value4 = myDiceTemplate.rollDice8();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 10-face dice testing...
        value1 = myDiceTemplate.rollDice10();
        value2 = myDiceTemplate.rollDice10();
        value3 = myDiceTemplate.rollDice10();
        value4 = myDiceTemplate.rollDice10();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 12-face dice testing...
        value1 = myDiceTemplate.rollDice12();
        value2 = myDiceTemplate.rollDice12();
        value3 = myDiceTemplate.rollDice12();
        value4 = myDiceTemplate.rollDice12();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // 20-face dice testing...
        value1 = myDiceTemplate.rollDice20();
        value2 = myDiceTemplate.rollDice20();
        value3 = myDiceTemplate.rollDice20();
        value4 = myDiceTemplate.rollDice20();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
        
        // Generic number of faces dice testing...
        value1 = myDiceTemplate.rollGenericDice(1549739);
        value2 = myDiceTemplate.rollGenericDice(1549739);
        value3 = myDiceTemplate.rollGenericDice(1549739);
        value4 = myDiceTemplate.rollGenericDice(1549739);
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
    }
    
}
