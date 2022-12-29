/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author emanuelgotesjo
 */
public class Validering {
    
    private static InfDB idb;
    
    
    /**
     * Konstruktor för Valideringsklassen, skickar med en databas
     * @param idb 
     * 
     */
    public Validering(InfDB idb){
        
        this.idb = idb;
        
    }
    
    /**
     * Kollar ifall ett Namn (String) finns i databasen 
     * 
     * @param namn en string innehållande användarnamn för databasen
     * @return  boolean
     * 
     * retunerar true ifall det namn som skickades med redan finns i databasen
     * 
     * 
     */
    public static boolean finnsUsernameiDB(String namn) {
        boolean finns = false;
        String evNamn;

        String sqlfraga1 = "SELECT Namn FROM Agent WHERE Namn like '" + namn + "'";
        String sqlfraga2 = "SELECT Namn FROM Alien WHERE Namn like '" + namn + "'";

        // Hämtar ut ur databasen
        try {
            evNamn = idb.fetchSingle(sqlfraga1);
            
            if(evNamn != null){
                finns = true;
            }
            else{
                evNamn = idb.fetchSingle(sqlfraga2);
                
                    if(evNamn != null){
                    finns = true;
                    }
                }
  
        } catch (InfException e) {
            System.out.println("Namnet finns inte" + e);

        }

        return finns;
    }
    
    //Returnerar true om det finns en Alien med in skrivet namn i databasen annars false
    public static boolean isUsernameAlien(String namn)
    {
        boolean finns = false;
        String evNamn;

        String sqlfraga1 = "SELECT Namn FROM Alien WHERE Namn like '" + namn + "'";
        
        try
        {
            evNamn = idb.fetchSingle(sqlfraga1);
            
            if(evNamn != null)
            {
                finns = true;
            }
            
        }
        catch(InfException e)
        {
            System.out.println("Namnet finns inte" + e);
        }
        
        return finns;
    }
    
    //Returnerar true om det finns en Agent med in skrivet namn i databasen annars false
    public static boolean IsUsernameAgent(String namn)
    {
        boolean finns = false;
        String evNamn;

        String sqlfraga1 = "SELECT Namn FROM Agent WHERE Namn like '" + namn + "'";
        
        try
        {
            evNamn = idb.fetchSingle(sqlfraga1);
            
            if(evNamn != null)
            {
                finns = true;
            }
            
        }
        catch(InfException e)
        {
            System.out.println("Namnet finns inte" + e);
        }
        
        return finns;
        
    }
    
}
