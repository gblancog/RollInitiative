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
public class DiceTester {

    public static void main(String[] args) {
        Dice eg1 = new Dice(1); // Always 1
        Dice eg2 = new Dice(6); // Standart dice
        Dice eg3 = new Dice(10);
        Dice eg4 = new Dice(100);

        int value1;
        int value2;
        int value3;
        int value4;

        // This one should be always 1
        value1 = eg1.rollDice();
        value2 = eg1.rollDice();
        value3 = eg1.rollDice();
        value4 = eg1.rollDice();

        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");

        // Values between 1 and 6
        value1 = eg2.rollDice();
        value2 = eg2.rollDice();
        value3 = eg2.rollDice();
        value4 = eg2.rollDice();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");

        // Values between 1 and 10
        value1 = eg3.rollDice();
        value2 = eg3.rollDice();
        value3 = eg3.rollDice();
        value4 = eg3.rollDice();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");

        // Values between 1 and 100
        value1 = eg4.rollDice();
        value2 = eg4.rollDice();
        value3 = eg4.rollDice();
        value4 = eg4.rollDice();
        
        System.out.println("Values are: [" + value1 + "," + value2 + ","
                + value3 + "," + value4 + "]");
    }

}
