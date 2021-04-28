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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    private CheckBoxes[] quarterNotes = new CheckBoxes[16];
    private List<String> notes = new ArrayList(13);
    private List<String> noteLabels = new ArrayList(13);
    private MidiPlayer MP;
    private Map<String, String> notess = new LinkedHashMap<>(13);
    
    
    @PostConstruct
    public void init(){
        
        
        getNotess().put("c", "72");
        getNotess().put("B", "71");
        getNotess().put("A#", "70");
        getNotess().put("A", "69");
        getNotess().put("G#", "68");
        getNotess().put("G", "67");
        getNotess().put("F#", "66");
        getNotess().put("F", "65");
        getNotess().put("E", "64");
        getNotess().put("D#", "63");
        getNotess().put("D", "62");
        getNotess().put("C#", "61");
        getNotess().put("C", "60");
        
        
        getNotes().add("72"); //c
        getNotes().add("71"); //B
        getNotes().add("70"); //A#
        getNotes().add("69"); //A
        getNotes().add("68"); //G#
        getNotes().add("67"); //G
        getNotes().add("66"); //F#
        getNotes().add("65"); //F
        getNotes().add("64"); //E
        getNotes().add("63"); //D#
        getNotes().add("62"); //D
        getNotes().add("61"); //C#
        getNotes().add("60"); //C
        
        getNoteLabels().add("c");
        getNoteLabels().add("B");
        getNoteLabels().add("A#");
        getNoteLabels().add("A");
        getNoteLabels().add("G#");
        getNoteLabels().add("G");
        getNoteLabels().add("F#");
        getNoteLabels().add("F");
        getNoteLabels().add("E");
        getNoteLabels().add("D#");
        getNoteLabels().add("D");
        getNoteLabels().add("C#");
        getNoteLabels().add("C");
        
        
        for(int i=0;i<quarterNotes.length;i++){
            getQuarterNotes()[i] = new CheckBoxes();
            getQuarterNotes()[i].setIndex(i);
        }
        
        MP = new MidiPlayer();
        
    }
    

    

    
    public void qnSubmit(){
        test0 = "-0->" + getQuarterNotes()[0].getStatus() + getQuarterNotes()[0].getIndex();
        test1 = "-1->" + getQuarterNotes()[1].getStatus() + getQuarterNotes()[1].getIndex();
        test2 = "-2->" + getQuarterNotes()[2].getStatus();
        test3 = "-3->" + getQuarterNotes()[3].getStatus();
    }
    
 
    public void compileTrack(){
        for(int i=0;i<getQuarterNotes().length; i++){
            MP.addQNote(getQuarterNotes()[i].getStatus(), getQuarterNotes()[i].getIndex());
            test3 = test3 + getQuarterNotes()[i].getStatus();
        }
        
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

    /**
     * @return the MP
     */
    public MidiPlayer getMP() {
        return MP;
    }

    /**
     * @param MP the MP to set
     */
    public void setMP(MidiPlayer MP) {
        this.MP = MP;
    }

    /**
     * @return the noteLabels
     */
    public List<String> getNoteLabels() {
        return noteLabels;
    }

    /**
     * @param noteLabels the noteLabels to set
     */
    public void setNoteLabels(List<String> noteLabels) {
        this.noteLabels = noteLabels;
    }

    /**
     * @return the notess
     */
    public Map<String, String> getNotess() {
        return notess;
    }

    /**
     * @param notess the notess to set
     */
    public void setNotess(Map<String, String> notess) {
        this.notess = notess;
    }

 
  
 

}
