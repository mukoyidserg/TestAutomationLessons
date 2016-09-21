package lesson2.classextensionwithobjects;


public class Oligarkh extends Man {
	private Money valuables;
	private Prisons prison;

	public Money getValuables() {
		return valuables;
	}

	public void setValuables(Money valuables) {
		this.valuables = valuables;
	}

	public Prisons getPrison() {
		return prison;
	}

	public void setPrison(Prisons prison) {
		this.prison = prison;
	}
	
	public static void main(String[] args) {
		
		Oligarkh romanAbramovich = new Oligarkh();
		Money romanAbramovichMoney = new Money(100000000, "USD", "http://www.mkyong.com/image/mypic.jpg");
		
		romanAbramovich.setValuables(romanAbramovichMoney);
		
		Prisons romanAbramovichPrison = new Prisons("Alcatraz");
		
		romanAbramovich.setPrison(romanAbramovichPrison);
		
		romanAbramovich.setName("Roman");
		romanAbramovich.setSurname("Abramovich");
		
		System.out.println("Name: "+romanAbramovich.getName()+
				"\nSurname: "+romanAbramovich.getSurname()+
				"\nPrison: "+romanAbramovich.getPrison().getPrisonName()+
				"\nMoney: "+romanAbramovich.getValuables().getValue()+
				" "+romanAbramovich.getValuables().getCurrencyName());
		romanAbramovich.getValuables().showCurrencyPicture(romanAbramovichMoney.getCurrencyPic());
	}

}
