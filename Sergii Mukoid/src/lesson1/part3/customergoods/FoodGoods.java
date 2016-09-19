package lesson1.part3.customergoods;


public class FoodGoods extends lesson1.part2.CustomerGoods {
                                private boolean Packing;
                                private boolean Label;
                                private String Turnover;
public boolean getPacking() {return Packing;}
public void setPacking (boolean Packing) {
	this.Packing = Packing;
} 
public boolean getLabel() {return Label;}
public void setLabel (boolean Label) {
	this.Label = Label;
}
public String getTurnover() {return Turnover;}
public void setTurnover (String Turnover) {
	this.Turnover = Turnover;
}

}
