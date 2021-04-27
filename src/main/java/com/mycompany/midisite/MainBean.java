/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midisite;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author aaron
 */
@Named(value = "mainBean")
@SessionScoped
public class MainBean implements Serializable {

    private String name = "Aaron";
    private List<CheckBoxes> quarterNotes = new ArrayList(50);
    private List<String> notes = new ArrayList(13);
    private List<String> selcNotes = new ArrayList(13);
    
    
    @PostConstruct
    public void init(){
        
        getNotes().add("60"); //C
        getNotes().add("61"); //C#
        getNotes().add("62"); //D
        getNotes().add("63"); //D#
        getNotes().add("64"); //E
        getNotes().add("65"); //F
        getNotes().add("66"); //F#
        getNotes().add("67"); //G
        getNotes().add("68"); //G#
        getNotes().add("69"); //A
        getNotes().add("70"); //A#
        getNotes().add("71"); //B
        getNotes().add("72"); //c
        
    }
    
    public void buttonPress(){
        
        
    }
    
    
    public void submit(){
        name = "-->" + this.quarterNotes.get(0).getStatus();
        
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
     * @return the notes
     */
    public List<String> getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    /**
     * @return the selcNotes
     */
    public List<String> getSelcNotes() {
        return selcNotes;
    }

    /**
     * @param selcNotes the selcNotes to set
     */
    public void setSelcNotes(List<String> selcNotes) {
        this.selcNotes = selcNotes;
    }

    /**
     * @return the quarterNotes
     */
    public List<CheckBoxes> getQuarterNotes() {
        return quarterNotes;
    }

    /**
     * @param quarterNotes the quarterNotes to set
     */
    public void setQuarterNotes(List<CheckBoxes> quarterNotes) {
        this.quarterNotes = quarterNotes;
    }

 

}
