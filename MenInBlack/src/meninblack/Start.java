package meninblack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emanuelgotesjo
 */

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class Start {
    
    private static InfDB idb; 
    
    // varför funkar det när static är borta?
    public static void main(String[] args) {

        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            System.out.println("funka");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

        new Inlog(idb).setVisible(true); 

    }
    
}
