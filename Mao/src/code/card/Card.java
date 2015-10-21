package code.card;

public class Card 
{
	public String suit;
	public String value;
	public String actualsuit;
	public String actualvalue;
	
	public Card(String s, String v)
	{
		suit = s;
		value = v;
		actualsuit = s;
		actualvalue = v;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getActualsuit() {
		return actualsuit;
	}

	public void setActualsuit(String actualsuit) {
		this.actualsuit = actualsuit;
	}

	public String getActualvalue() {
		return actualvalue;
	}

	public void setActualvalue(String actualvalue) {
		this.actualvalue = actualvalue;
	}
}
