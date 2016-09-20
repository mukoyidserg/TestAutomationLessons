package lesson1.part3.touchscreendevices;


public class SmartPhone extends lesson1.part2.TouchScreenDevice {
                                private int SimCards;
                                private String Standards;
                                private String Restrictions;
public int getSimCards() {return SimCards;}
public void setSimCards (int SimCards) {
	this.SimCards = SimCards;
} 
public String getStandards() {return Standards;}
public void setStandards (String Standards) {
	this.Standards = Standards;
}
public String getRestrictions() {return Restrictions;}
public void setRestrictions (String Restrictions) {
	this.Restrictions = Restrictions;
}

}
