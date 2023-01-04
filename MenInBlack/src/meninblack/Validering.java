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
    
    public static boolean finnsKontor(String namn) {
        boolean kontorFinns = false;
        String evKontor;
        
        String fraga1 = "SELECT kontorsbeteckning from kontorschef where kontorsbeteckning ='" + namn + "'";

        try {
            evKontor = idb.fetchSingle(fraga1);

            if (evKontor != null) {
                kontorFinns = true;
            }
        } catch (InfException ettE) {
            JOptionPane.showMessageDialog(null, "Detta kontor finns ej");
            System.out.println("Internt fel" + ettE);
        }
        return kontorFinns;
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
        
        String valdRegex = "^[A-Z](?=.{1,29}$)[A-Za-z]*(?:\\h+[A-Z][A-Za-z]*)*$";
        boolean godkantNamn = nyttNamn.matches(valdRegex);

        if(godkantNamn && nyttNamn.length() < 20){
            godkantNamn = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Användarnamnet är fel.\nDet får max innehålla 20 tecken och bara vara bokstäver\nVarje nytt ord måste börja med stor bokstav");
            
        }
        System.out.println(godkantNamn);
        return godkantNamn;
    }
    
    
    
    
    /**
     * Checkar om ett tellefonnummer är korrekt
     * @param telenr en string som är ett telefonnummer
     * @return true om telefonnummret är godkänt. annars false
     */
    public static boolean isTelefonnummer(String telenr) {
        // Regex för att kolla ifall det är ett nummer
         String regex = "^[0-9]{1,30}$";
         
         if(!telenr.matches(regex)){
             JOptionPane.showMessageDialog(null, "Telefonummret är felaktigt.\n Får bara innehålla 30 tecken och det måste vara siffror");
         }
        
        return telenr.matches(regex);
    }
    
    
    
    
    /**
     * Checkar om valt lösenord är godkänt
     * 
     * @param losen Sträng med det lösenordet som ska checkas
     * @return true om lösenordet är godkänt
     */
    public static boolean validLosen(String losen) {
        boolean godkant = false;

        //Skriver ut en uppmaning till användaren för att
        if (losen.length() < 7 && (!" ".equals(losen)) && !losen.isEmpty()) {
            godkant = true;
        } else {
            JOptionPane.showMessageDialog(null, "Lösenordet är felaktigt. Du måste skriva in något\nSamt att det inte får vara längre än 6 tecken");
        }

        return godkant;
    }
    
    
    /**
     * 
     * @param text tar en String som man kollar ifall den är tom
     * @return true om strängen innehåller tecken, false om den är tom
     */
    public static boolean isTom(String text){
        boolean godkant = true;
        
        if(text.equals(" ") || text.isEmpty()) {
            godkant = false;
            
        }
        
        return godkant;
    }
        
    
    
    
    
    
    private static boolean checkaAnsvarig(String agentNamn) {
        
        String ansvarigStatus = null;
        boolean arAnsvarig = false;
        
        try { 
            String ansvarigNamn = agentNamn; 
            String fraga = "select alien.`Namn` from alien join agent on Ansvarig_Agent = agent.`Agent_ID` where agent.`Namn` ='" +ansvarigNamn+"'";
            ansvarigStatus = idb.fetchSingle(fraga);
        } catch (InfException ettE) {
            System.out.println("Internt fel" + ettE);
        } 
        if (ansvarigStatus != null) {
            arAnsvarig = true;
        }
        return arAnsvarig;
    }
}

    


