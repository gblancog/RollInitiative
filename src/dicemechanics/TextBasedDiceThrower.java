/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicemechanics;

import java.util.Scanner;

public class TextBasedDiceThrower {

    public static void main(String args[]) {

        // User I/O stuff
        Scanner in = new Scanner(System.in);
        String userOption;
        int diceLaw;

        DiceTemplate dt = DiceTemplate.getTemplate();

        do {
            System.out.println("Please tell me what to do: ");
            userOption = in.nextLine();
            userOption = userOption.toUpperCase();
            switch (userOption) {

                case "END":
                    break;

                case "1D2":
                    diceLaw = dt.rollDice2();
                    showResults(diceLaw, 2);
                    System.out.println();
                    break;

                case "1D3":
                    diceLaw = dt.rollDice3();
                    showResults(diceLaw, 3);
                    System.out.println();
                    break;

                case "1D4":
                    diceLaw = dt.rollDice4();
                    showResults(diceLaw, 4);
                    System.out.println();
                    break;

                case "1D6":
                    diceLaw = dt.rollDice6();
                    showResults(diceLaw, 6);
                    System.out.println();
                    break;

                case "1D8":
                    diceLaw = dt.rollDice8();
                    showResults(diceLaw, 8);
                    System.out.println();
                    break;

                case "1D10":
                    diceLaw = dt.rollDice10();
                    showResults(diceLaw, 10);
                    System.out.println();
                    break;

                case "1D12":
                    diceLaw = dt.rollDice12();
                    showResults(diceLaw, 12);
                    System.out.println();
                    break;

                case "1D20":
                    diceLaw = dt.rollDice20();
                    showResults(diceLaw, 20);
                    System.out.println();
                    break;
                    
                case "1D100":
                    diceLaw = dt.rollDice100();
                    showResults(diceLaw, 100);
                    System.out.println();
                    break;
                    
                default:
                    String[] tokens = userOption.split("D");
                    int numberOfDices = new Integer(tokens[0]);
                    int numberOfFaces = new Integer(tokens[1]);

                    for (int i = 0; i < numberOfDices; i++) {
                        diceLaw = dt.rollGenericDice(numberOfFaces);
                        showResults(diceLaw, numberOfFaces);
                    }
                    System.out.println();
                    break;
            }
        } while (!"END".equals(userOption));
    }

    private static void showResults(int destiny, int diceSides) {
        System.out.println("You have thrown a " + diceSides + "-faces dice, and you got: " + destiny + "!");
    }

}
