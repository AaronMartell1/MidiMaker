/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midisite;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;

/**
 *
 * @author aaron
 */
@Named(value = "mainBean")
@SessionScoped
public class MainBean implements Serializable {

    private String name = "Aaron";
    private CheckBoxes cb;
    
    @PostConstruct
    public void init(){
        
        getCb().setNotes(null);
        getCb().setNotes(new int[]{60,61,62,63,64,65,66,67,68,69,70,71,72});
        getCb().setStatus(null);
    }
    
    public void buttonPress(){
        
        
    }
    
    
    
    
    
    /**
     * Creates a new instance of MainBean
     */
/*    public MainBean() {
        
      Dunno if this is needed  
    }
*/
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

    /**
     * @return the cb
     */
    public CheckBoxes getCb() {
        return cb;
    }

    /**
     * @param cb the cb to set
     */
    public void setCb(CheckBoxes cb) {
        this.cb = cb;
    }
    
}
