
package com.mycompany.midisite;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

/**
 *
 * @author aaron
 */

//MidiMessage class for easily handeling MidiEvents (MidiEvents are responsible for adding notes to a Midi Track)
public class MidiMessage {
    private int command, pitch, volume, channel, tick;
    
    //Constructor
    public MidiMessage(){
        command =0;
        pitch=0;
        volume=0; 
        channel=0; 
        tick=0;
    }
        
    //Method to handle MidiEvents, combines MIDI ShortMessage with MidiEvent
    public MidiEvent makeEvent(int command, int channel, int pitch, int volume, int tick){
        
        MidiEvent ME = null;
        
        try{  
            ShortMessage m = new ShortMessage();
            m.setMessage(command, channel, pitch, volume);
            ME = new MidiEvent(m, tick);
                        
        } catch(Exception ex){
            ex.printStackTrace();
            
        }
        return ME;
    }

    /**
     * @return the command
     */
    public int getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(int command) {
        this.command = command;
    }

    /**
     * @return the pitch
     */
    public int getPitch() {
        return pitch;
    }

    /**
     * @param pitch the pitch to set
     */
    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * @return the tick
     */
    public int getTick() {
        return tick;
    }

    /**
     * @param tick the tick to set
     */
    public void setTick(int tick) {
        this.tick = tick;
    }
}
