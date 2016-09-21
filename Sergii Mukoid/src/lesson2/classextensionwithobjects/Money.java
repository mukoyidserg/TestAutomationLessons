package lesson2.classextensionwithobjects;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Money {
	private int value;
	private String currencyName;
	private String currencyPic;
	
public Money(int value, String currencyName, String currencyPic) {
	this.value = value;
	this.currencyName = currencyName;
	this.currencyPic = currencyPic;
	}

public Money(int value, String currencyName) {
	this.value = value;
	this.currencyName = currencyName;
	}

public Money() {
	// TODO Auto-generated constructor stub
}

public int getValue() {return value;}
public String getCurrencyName() {return currencyName;}


public String getCurrencyPic() {
	return currencyPic;
}

public void setCurrencyPic(String currencyPic) {
	this.currencyPic = currencyPic;
}

public void showCurrencyPicture(String pathToFileInInternet)
{
	Image image = null;
    try {
        URL url = new URL(pathToFileInInternet);
        image = ImageIO.read(url);
    } catch (IOException e) {
    	e.printStackTrace();
    }

    JFrame frame = new JFrame();
    frame.setSize(300, 300);
    JLabel label = new JLabel(new ImageIcon(image));
    frame.add(label);
    frame.setVisible(true);
}

}


