/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
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
    
    
    /**
     * Kontrollerar ifall en agent har Administratörsstatus i databasen
     * 
     * @param agentNamn
     * @return boolean true om Agentens namn är administratör
     */
    public static boolean checkAdmin(String agentNamn) {

        String adminstatus = "N";
        boolean arAdmin = false;

        try {
            String namnet = agentNamn;
            String frågan = "SELECT Administrator FROM Agent WHERE Namn like '" + namnet + "'";
            adminstatus = idb.fetchSingle(frågan);

        } catch (InfException ettUndantag) {
            System.out.println("Problem med kontroll av admin" + ettUndantag);
        }
        if (adminstatus.equals("J")) {
            arAdmin = true;
        }

        return arAdmin;
    }
    
    /**
     * Retunerar en sträng som har rätt format för databasen Ger stora bokstäver
     * på alla versaler
     *
     * @param namn värdet på det Namn som ska retuneras
     * @return Strin
     */
    public static String returGodkäntNamn(String namn) {

        // Gör om namn till en charArray med alla täcken i Stringen
        char[] charArray = namn.trim().toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            //Kontrollerar ifall tecknet är en bokstav
            if (Character.isLetter(charArray[i])) {

                //Kontrollerar ifall det är tomrum innan bokstaven
                if (foundSpace) {

                    // ändrar så att bokstaven blir stor
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                //ifall den nya tecknet inte är ett tecken
                foundSpace = true;
            }
        }

        // Konverterar char Array till en String
        String nyttNamn = String.valueOf(charArray);

        return nyttNamn;
    }
    
    /**
     * Metoden kontrollerar ifall ett namn är korrekt utifrån satt regural expression
     * Namn måste börja med stor bokstav och varje nytt ord måste vara stort.
     * Max 19 tecken.
     * @param namn ett namn som ska användas som användarnamn eller Namn i någon av tabellerna i databasen
     * @return true om namnet är godkänt utifrån satt regural expression för systemet
     */
    public static boolean isNamnGodkant(String namn){
        String nyttNamn = namn;
        
        String valdRegex = "[A-Z][a-zA-Z]{1,19}( [A-Z][a-zA-Z]{1,19})?";
//        boolean godkäntNamn = nyttNamn.matches(valdRegex);

         boolean godkäntNamn = true;

        if(godkäntNamn && nyttNamn.length() < 20){
            godkäntNamn = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Användarnamnet är fel.\nDet får max innehålla 20 tecken och bara vara bokstäver");
            
        }
        System.out.println(godkäntNamn);
        return godkäntNamn;
    }
    
    public static boolean isTelefonnummer(String telenr) {
        // Regex för att kolla ifall det är ett nummer
         String regex = "^[0-9]{1,30}$";
        
        return telenr.matches(regex);
    }
    
//        public static boolean validLosen(String telenr) {
//        // Regex för att kolla ifall det är ett nummer
//         String regex = "^[0-9]{1,30}$";
//         
//         boolean godkänt = telenr.matches(regex);
//        
//         //Skriver ut en uppmaning till användaren för att
//         if(!godkänt){
//             JOptionPane.showMessageDialog(null, "Lösenordet är för långt. Får max innehålla 6 tecken");
//         }
//         
//        return 
//    }
    
}

