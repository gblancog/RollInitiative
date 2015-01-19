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
public class DiceTemplate {

    // DnD dice options by default
    private Dice dice2;
    private Dice dice3;
    private Dice dice4;
    private Dice dice6;
    private Dice dice8;
    private Dice dice10;
    private Dice dice12;
    private Dice dice20;
    private Dice dice100;

    // Just in case you need another dice option
    private Dice genericDice;

    // Singleton pattern
    private static DiceTemplate thisDiceTemplate;

    private DiceTemplate() {
        dice2 = new Dice(2);
        dice3 = new Dice(3);
        dice4 = new Dice(4);
        dice6 = new Dice(6);
        dice8 = new Dice(8);
        dice10 = new Dice(10);
        dice12 = new Dice(12);
        dice20 = new Dice(20);
        dice100 = new Dice(100);
    }

    public static DiceTemplate getTemplate() {
        if (thisDiceTemplate == null) {
            thisDiceTemplate = new DiceTemplate();
        }
        return thisDiceTemplate;
    }

    public int rollDice2() {
        return dice2.rollDice();
    }

    public int rollDice3() {
        return dice3.rollDice();
    }

    public int rollDice4() {
        return dice4.rollDice();
    }

    public int rollDice6() {
        return dice6.rollDice();
    }

    public int rollDice8() {
        return dice8.rollDice();
    }

    public int rollDice10() {
        return dice10.rollDice();
    }

    public int rollDice12() {
        return dice12.rollDice();
    }

    public int rollDice20() {
        return dice20.rollDice();
    }

    public int rollDice100() {
        return dice100.rollDice();
    }
    
    public int rollGenericDice(int faces) {
        genericDice = new Dice(faces);
        return genericDice.rollDice();
    }
}
