
package com.mycompany.midisite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaron
 */

//CheckBoxes class responsible for handling the data for each column of notes to provide to each p:selectManyCheckbox
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
