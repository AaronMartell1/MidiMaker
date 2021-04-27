/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midisite;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author aaron
 */
public class CheckBoxes {
    private int index;
    private List<String> status = new ArrayList(13);


  
    /**
     * @return the status
     */
    public List<String> getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(List<String> status) {
        this.status = status;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }
    

    
    
    
    
    
    

    
}
