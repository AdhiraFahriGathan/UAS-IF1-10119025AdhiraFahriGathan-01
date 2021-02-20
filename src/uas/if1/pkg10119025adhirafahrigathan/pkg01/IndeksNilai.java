/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119025adhirafahrigathan.pkg01;

/**
 *
 * @author User
 */
public class IndeksNilai {
    private char index;

    public char Addindex(double nilai) {
        if ((nilai >= 80) && (nilai <= 100)) {
            return index = 'A';
        } else if ((nilai >= 68) && (nilai < 80)) {
            return index = 'B';
        } else if ((nilai >= 56) && (nilai < 68)) {
            return index = 'C';
        } else if ((nilai >= 45) && (nilai < 56)) {
            return index = 'D';
        }
        return index = 'E';
    }
}
