package lesson1.part3.customergoods;


public class NonFoodGoods extends lesson1.part2.CustomerGoods {
                                public String Precautions;
                                private String ReturnPolicy;
                                private String Turnover;
public String getPrecautions() {return Precautions;}
public void setPrecautions (String Precautions) {
	this.Precautions = Precautions;
} 
public String getReturnPolicy() {return ReturnPolicy;}
public void setReturnPolicy (String ReturnPolicy) {
	this.ReturnPolicy = ReturnPolicy;
}
public String getTurnover() {return Turnover;}
public void setTurnover (String Turnover) {
	this.Turnover = Turnover;
}

}
