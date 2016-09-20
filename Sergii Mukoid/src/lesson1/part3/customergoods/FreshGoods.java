package lesson1.part3.customergoods;


public class FreshGoods extends lesson1.part2.CustomerGoods {
                                private boolean GoodsType;
                                private double FreshnessPercentage;
                                private boolean DeliveryType;
public boolean getGoodsType() {return GoodsType;}
public void setGoodsType (boolean GoodsType) {
	this.GoodsType = GoodsType;
} 
public double getFreshnessPercentage() {return FreshnessPercentage;}
public void setFreshnessPercentage (double FreshnessPercentage) {
	this.FreshnessPercentage = FreshnessPercentage;
}
public boolean getDeliveryType() {return DeliveryType;}
public void setDeliveryType (boolean DeliveryType) {
	this.DeliveryType = DeliveryType;
}

}
