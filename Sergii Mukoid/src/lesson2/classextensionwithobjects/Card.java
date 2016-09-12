package lesson2.classextensionwithobjects;

public class Card extends Man {
	private int cardId;
	private String issueDate;
    
public Card(int cardId, String issueDate) {
	this.cardId = cardId;
	this.issueDate = issueDate;
}
public void setCardId(int cardId) {
	this.cardId = cardId;
}
public int getCardId() {return cardId;}

public String getIssueDate() {return issueDate;}

}
