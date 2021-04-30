
package com.mycompany.midisite;

import java.util.List;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

/**
 *
 * @author aaron
 */

//MidiPlayer class responsible for Midi components and realted functions
public class MidiPlayer {
    
    private Sequence seq;
    private Track trk;
    private Sequencer seqr;
   

    //Constructor initializes the MIDI sequencer, a sequence, and a track on that sequence
    public MidiPlayer(){
        try{
            seqr = MidiSystem.getSequencer();
            seqr.open();
            
            seq = new Sequence(Sequence.PPQ, 4);
            
            trk = seq.createTrack();
            
            
        } catch(Exception ex){
            ex.printStackTrace();
        }    
    }
    
    //Method to play the created MIDI sequence, sets tempo factor (default tempo is 120 beats per minute, tempo factor is multiplier of that BPM)
    public void playMidi(float tempo){
                 
        try {       
            seqr.setTempoInBPM(120);
            seqr.setTempoFactor(tempo);
            
            seqr.setSequence(seq);
            seqr.setTickPosition(0);
            seqr.start();
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    //Add Quarter Note, i.e. a single collumn of checkboxes
    public void addQNote(List<String> status, int index){
        
        for(String s: status){
            MidiMessage mm = new MidiMessage();
            int n = Integer.valueOf(s);
            trk.add(mm.makeEvent(144, 0, n, 100, index*4));
            trk.add(mm.makeEvent(128, 0, n, 100, (index*4) + 4));
            
        }
    }
    
    //Deletes and reinitializes the track (clears all events, or notes, from track)
    public void clearTrack(){
        
        seq.deleteTrack(trk);
        trk = seq.createTrack();
    }
  
    /**
     * @return the seq
     */
    public Sequence getSeq() {
        return seq;
    }

    /**
     * @param seq the seq to set
     */
    public void setSeq(Sequence seq) {
        this.seq = seq;
    }

    /**
     * @return the trk
     */
    public Track getTrk() {
        return trk;
    }

    /**
     * @param trk the trk to set
     */
    public void setTrk(Track trk) {
        this.trk = trk;
    }

    /**
     * @return the seqr
     */
    public Sequencer getSeqr() {
        return seqr;
    }

    /**
     * @param seqr the seqr to set
     */
    public void setSeqr(Sequencer seqr) {
        this.seqr = seqr;
    }

}

