package lesson2.classextensionwithobjects;

public class Worker extends Man {
	private String position;
	private Card employeePassCard;
public Card getCard() {return employeePassCard;}
public void setCard (Card employeePassCard) {
	this.employeePassCard = employeePassCard;
}
public String getPosition() {return position;}
public void setPosition (String position) {
	this.position = position;
}

public static void main(String[] args) {
	Card ivanPetrovEmployeeCard = new Card(54568, "Nov 19, 1991");
	Worker ivanPetrov = new Worker();
	ivanPetrov.setCard(ivanPetrovEmployeeCard);
	ivanPetrov.getCard().setCardId(777);
	ivanPetrov.setName("Ivan");
	ivanPetrov.setSurname("Petrov");
	ivanPetrov.setPosition("Engineer");
	System.out.println("Name: "+ivanPetrov.getName()+
			"\nSurname: "+ivanPetrov.getSurname()+
			"\nPosition: "+ivanPetrov.getPosition()+
			"\nCard ID: "+ivanPetrov.getCard().getCardId()+
			"\nIssue Date: "+ivanPetrov.getCard().getIssueDate());
	
}


}
