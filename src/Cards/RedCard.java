package Cards;

public class RedCard extends Card
{
	private String color = "red" ;

	public RedCard(int pNumber, float pValue)
	{
		super(pNumber,pValue);
		
	}
	
	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	

	
	
}
