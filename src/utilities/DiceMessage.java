/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author Gorka
 */
public class DiceMessage {
    private String user;
    private int dice;
    private int result;
    
    public DiceMessage(String u, int d, int r) {
        user = u;
        dice = d;
        result = r;
    }
    
    public String getUser() {
        return user;
    }
    
    public int getDice() {
        return dice;
    }
    
    public int getResult() {
        return result;
    }
}
