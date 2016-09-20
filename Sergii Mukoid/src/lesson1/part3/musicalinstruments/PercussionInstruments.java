package lesson1.part3.musicalinstruments;


public class PercussionInstruments extends lesson1.part2.MusicalInstruments {
                                private String SoundMethod;
                                private String MusicFunction;
                                private boolean Spread;
public String getSoundMethod() {return SoundMethod;}
public void setSoundMethod (String SoundMethod) {
	this.SoundMethod = SoundMethod;
} 
public String getMusicFunction() {return MusicFunction;}
public void setMusicFunction (String MusicFunction) {
	this.MusicFunction = MusicFunction;
}
public boolean getSpread() {return Spread;}
public void setSpread (boolean Spread) {
	this.Spread = Spread;
}

}
