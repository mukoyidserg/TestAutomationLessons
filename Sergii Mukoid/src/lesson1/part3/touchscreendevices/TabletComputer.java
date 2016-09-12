
public class TabletComputer extends TouchScreenDevice {
                                private boolean Keyboard;
                                private String SizeClass;
                                private boolean Handwriting;
public boolean getKeyboard() {return Keyboard;}
public void setKeyboard (boolean Keyboard) {
	this.Keyboard = Keyboard;
} 
public String getSizeClass() {return SizeClass;}
public void setSizeClass (String SizeClass) {
	this.SizeClass = SizeClass;
}
public boolean getHandwriting() {return Handwriting;}
public void setHandwriting (boolean Handwriting) {
	this.Handwriting = Handwriting;
}

}
