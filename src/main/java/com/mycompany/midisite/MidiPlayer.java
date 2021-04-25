/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midisite;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

/**
 *
 * @author aaron
 */
public class MidiPlayer {
    
    public void PlayerSetup(){
        try{
            Sequencer seqr = MidiSystem.getSequencer();
            seqr.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            
            Track trk = seq.createTrack();
            
            
/*            for( int i = 5; i < (4*numoNotes) + 5; i += 4){
                
                MidiMessage mm = new MidiMessage();
                trk.add(mm.makeEvent(144, 0, i+18, 100, i));
                trk.add(mm.makeEvent(128, 0, i+18, 100, i+2));
                trk.add(mm.makeEvent(144, 0, i+26, 100, i));
                trk.add(mm.makeEvent(128, 0, i+26, 100, i+2));
            }
*/            
            seqr.setSequence(seq);
            
            seqr.setTempoInBPM(120);
            
            seqr.start();
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Add Quarter Note, i.e. a single collumn of checkboxes
    public void addQNote(boolean[] status, Track track){
        for(int i=0;i<14;i++){
            if(status[i]==true){
               MidiMessage mm = new MidiMessage();
               track.add(mm.makeEvent(144,1,1,1,1));
               track.add(mm.makeEvent(144,1,1,1,1));
            }
        }
    }
}

