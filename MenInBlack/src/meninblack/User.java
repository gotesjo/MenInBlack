/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack;

import oru.inf.InfDB;

/**
 *
 * @author emanuelgotesjo
 */
public class User {
    
    //Klassens fält
    InfDB idb;
    String username;
    
    public User(String signInUser){
        
        this.idb = idb;
        username = signInUser;
        
        
    }
    
    
    public void setUsername(String name){
        username = name;
    }
    
    public String getUsername(){
        return username;
    }
    
    
}
