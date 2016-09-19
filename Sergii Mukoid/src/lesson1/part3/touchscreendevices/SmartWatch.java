package lesson1.part3.touchscreendevices;


public class SmartWatch extends lesson1.part2.TouchScreenDevice {
                                private String Connectivity;
                                private boolean Camera;
                                private int WaterResist;
public String getConnectivity() {return Connectivity;}
public void setConnectivity (String Connectivity) {
	this.Connectivity = Connectivity;
} 
public boolean getCamera() {return Camera;}
public void setCamera (boolean Camera) {
	this.Camera = Camera;
}
public int getWaterResist() {return WaterResist;}
public void setWaterResist (int WaterResist) {
	this.WaterResist = WaterResist;
}

}
