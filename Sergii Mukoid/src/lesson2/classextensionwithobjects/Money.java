package lesson2.classextensionwithobjects;

public class Money {
	private int value;
	private String currencyName;
	
public Money(int value, String currencyName) {
	this.value = value;
	this.currencyName = currencyName;
		
	}

public int getValue() {return value;}
public String getCurrencyName() {return currencyName;}
	/*public void showPicture() {
	try {
	    URL url = new URL(getCodeBase(), "examples/strawberry.jpg");
	    img = ImageIO.read(url);
	} catch (IOException e) {
	}
}*/
}
//show currency images on the screen (!)
