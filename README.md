# MidiMaker
JSF application to create and play MIDIs

## Motivation
  To begin, I have a very big interest in music, I play many instruments, though I have no formal
musical education and a very limited grasp on music theory and, therefor, I am unsure at the notes I am
playing, what notes combine to create a chord, or what sequence of notes would sound pleasing
together. Most music software is either very expensive, increasingly complicated, or both, and such
tools would make understanding music all the more simple, so I decided to create a sort of small scale
audio software for simply creating Musical Instrument Digital Interface, or MIDI, tracks. 

## Design
  The website consists of a single home page: the “MidiMaker” page. This main page holds a grid of checkboxes, each column of checkboxes represents one quarter note (a quarter note refers to a note that lasts one forth of a musical phrase, or measure) and are each created with a p:selectManyCheckbox PrimeFaces component. Each checkbox in a row is associated with a note, labeled in line at the far left of the page, and holds the ‘pitch’ value of each note. When the ‘Play’ button below the grid is clicked, the value of every checkbox in a column is stored in a list, with index, in an instance of a CheckBoxes array class and passed to the addQNote method where the associated note is added at the relevant quarter note to a MIDI Track, which is then played. The below the measure, there is a “Playback Speed” slider allowing for the user to adjust the tempo the MIDI Track is played at.

## Running the Application
  * Download MidiMaker as a zip and extract the file.
  * Open the project folder in your prefered IDE.

