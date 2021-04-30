
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

    private CheckBoxes[] quarterNotes = new CheckBoxes[32];
    private List<String> notes = new ArrayList(13);
    private MidiPlayer MP;
    private Map<String, String> notesandLabels = new LinkedHashMap<>(13);
    private float tempo;
    
    
    @PostConstruct
    public void init(){
        
        //Initializing String Map for the first, left-most column of checkboxes
        //Provides the note value for each box in the column and provides a label for each row
        getNotesandLabels().put("c", "72");
        getNotesandLabels().put("B", "71");
        getNotesandLabels().put("A#", "70");
        getNotesandLabels().put("A", "69");
        getNotesandLabels().put("G#", "68");
        getNotesandLabels().put("G", "67");
        getNotesandLabels().put("F#", "66");
        getNotesandLabels().put("F", "65");
        getNotesandLabels().put("E", "64");
        getNotesandLabels().put("D#", "63");
        getNotesandLabels().put("D", "62");
        getNotesandLabels().put("C#", "61");
        getNotesandLabels().put("C", "60");
        
        //Initializing List of pitch values used as value in each column of checkboxes
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
        
        //Initialize tempo
        tempo = 1;
        
        //Initializing an instance of the CheckBoxes class, holds the selected pitch values 
        for(int i=0;i<quarterNotes.length;i++){
            getQuarterNotes()[i] = new CheckBoxes();
            getQuarterNotes()[i].setIndex(i);
        }
        
        //Initializing an instance of a MidiPlayer class
        MP = new MidiPlayer();
        
    }
    
 
    public void compileTrack(){
        for(int i=0;i<getQuarterNotes().length; i++){
            MP.addQNote(getQuarterNotes()[i].getStatus(), getQuarterNotes()[i].getIndex());
            
        }
        
        MP.playMidi(tempo);
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
     * @return the notesandLabels
     */
    public Map<String, String> getNotesandLabels() {
        return notesandLabels;
    }

    /**
     * @param notesandLabels the notesandLabels to set
     */
    public void setNotesandLabels(Map<String, String> notesandLabels) {
        this.notesandLabels = notesandLabels;
    }

    /**
     * @return the tempo
     */
    public float getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

}
