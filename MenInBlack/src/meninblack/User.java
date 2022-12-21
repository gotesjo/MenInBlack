/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author emanuelgotesjo
 */
public class User {
    
    //Klassens fält
    InfDB idb;
    String username;
    
    public User(InfDB idb, String signInUser){
        
        this.idb = idb;
        username = signInUser;
        
        
    }
    
    
    public void setUsername(String name){
        username = name;
    }
    
    public String getUsername(){
        return username;
    }
    
    /**
     * Get metod som inte tar några parametrar.
     * @return 
     * Retunerar en String av Inloggad användares Områdeschef
     * 
     */
    public String getOmradeschef(){
        String chef = "";
        
        String sqlFraga = """
                          SELECT Agent.namn FROM Agent
                          join Omradeschef on Agent.Agent_ID = Omradeschef.Agent_ID
                          join Omrade on Omradeschef.Omrade = Omrade.Omrades_ID
                          join plats on  Omrade.Omrades_ID = plats.Finns_I
                          join Alien on plats.Plats_ID = Alien.Plats
                          WHERE Alien.Namn like '""" + username + "'";
        
        try{
        chef = idb.fetchSingle(sqlFraga);
        
        } catch(InfException e){
            
            JOptionPane.showMessageDialog(null, "Något är lurt");
            System.out.println("Internt Felmeddelande" + e.getMessage());
        }
        
        
        return chef;
    }
}
