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
    private String test0 = "0";
    private String test1 = "1";
    private String test2 = "2";
    private String test3 = "3";
    private CheckBoxes[] quarterNotes = new CheckBoxes[50];
    private List<String> notes = new ArrayList(13);
    private List<String> tmpStatus = new ArrayList(13);
    
    
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
        
        for(int i=0;i<quarterNotes.length;i++){
            getQuarterNotes()[i] = new CheckBoxes();
        }
        
            
        
    }
    
    public void buttonPress(){
        
        
    }
    
    
    public void submit(){
        
        
        name = "-->" + tmpStatus;
        
 
    }
    
    public void qnSubmit(){
        test0 = "-0->" + getQuarterNotes()[0].getStatus();
        test1 = "-1->" + getQuarterNotes()[1].getStatus();
        test2 = "-2->" + getQuarterNotes()[2].getStatus();
        test3 = "-3->" + getQuarterNotes()[3].getStatus();
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
     * @return the tmpStatus
     */
    public List<String> getTmpStatus() {
        return tmpStatus;
    }

    /**
     * @param tmpStatus the tmpStatus to set
     */
    public void setTmpStatus(List<String> tmpStatus) {
        this.tmpStatus = tmpStatus;
    }


    /**
     * @return the test0
     */
    public String getTest0() {
        return test0;
    }

    /**
     * @param test0 the test0 to set
     */
    public void setTest0(String test0) {
        this.test0 = test0;
    }

    /**
     * @return the quarterNotes
     */
    public CheckBoxes[] getQuarterNotes() {
        return quarterNotes;
    }

    /**
     * @param quarterNotes the quarterNotes to set
     */
    public void setQuarterNotes(CheckBoxes[] quarterNotes) {
        this.quarterNotes = quarterNotes;
    }

    /**
     * @return the test1
     */
    public String getTest1() {
        return test1;
    }

    /**
     * @param test1 the test1 to set
     */
    public void setTest1(String test1) {
        this.test1 = test1;
    }

    /**
     * @return the test2
     */
    public String getTest2() {
        return test2;
    }

    /**
     * @param test2 the test2 to set
     */
    public void setTest2(String test2) {
        this.test2 = test2;
    }

    /**
     * @return the test3
     */
    public String getTest3() {
        return test3;
    }

    /**
     * @param test3 the test3 to set
     */
    public void setTest3(String test3) {
        this.test3 = test3;
    }

 
  
 

}
