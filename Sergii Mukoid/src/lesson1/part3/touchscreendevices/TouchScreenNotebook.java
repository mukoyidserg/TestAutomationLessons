package lesson1.part3.touchscreendevices;


public class TouchScreenNotebook extends lesson1.part2.TouchScreenDevice {
                                private String VideoCard;
                                private String PurposeType;
                                private int NoChargeHours;
public String getVideoCard() {return VideoCard;}
public void setVideoCard (String VideoCard) {
	this.VideoCard = VideoCard;
} 
public String getPurposeType() {return PurposeType;}
public void setPurposeType (String PurposeType) {
	this.PurposeType = PurposeType;
}
public int getNoChargeHours() {return NoChargeHours;}
public void setNoChargeHours (int NoChargeHours) {
	this.NoChargeHours = NoChargeHours;
}

}
