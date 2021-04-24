/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midisite;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author aaron
 */
@Named(value = "mainBean")
@SessionScoped
public class MainBean implements Serializable {

    private String name = "Aaron";
    
    /**
     * Creates a new instance of MainBean
     */
    public MainBean() {
        
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
