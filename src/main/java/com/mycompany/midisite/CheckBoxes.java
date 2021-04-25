/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midisite;




/**
 *
 * @author aaron
 */
public class CheckBoxes {
    
    private int notes[] = new int[13];
    private boolean[] status = new boolean[13];

    
    
    
    
    
    
    /**
     * @return the notes
     */
    public int getNotes(int i) {
        return notes[i];
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(int[] notes) {
        this.notes = notes;
    }
    
    /**
     * @return the status
     */
    public boolean getStatus(int i) {
        return status[i];
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean[] status) {
        this.status = status;
    }
    
    
    
}
