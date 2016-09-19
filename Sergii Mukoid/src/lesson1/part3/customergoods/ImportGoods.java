package lesson1.part3.customergoods;


public class ImportGoods extends lesson1.part2.CustomerGoods {
                                public String ForDistributor;
                                private String Regulations;
                                private int DeliveryTime;
public String getForDistributor() {return ForDistributor;}
public void setForDistributor (String ForDistributor) {
	this.ForDistributor = ForDistributor;
} 
public String getRegulations() {return Regulations;}
public void setRegulations (String Regulations) {
	this.Regulations = Regulations;
}
public int getDeliveryTime() {return DeliveryTime;}
public void setDeliveryTime (int DeliveryTime) {
	this.DeliveryTime = DeliveryTime;
}

}
