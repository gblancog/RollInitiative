/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicemechanics;

import java.util.Random;

/**
 *
 * @author Gorka
 */
public class Dice {
    private Random r;
    private int faces;
    
    public Dice(int f){
        r = new Random();
        faces = f;
    }
    
    public int rollDice(){
        int n = r.nextInt(faces) + 1;
        return n;
    } 
}
