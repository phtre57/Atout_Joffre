package Cards;

public class GreenCard extends Card
{
	private String color = "green" ;

	public GreenCard(int pNumber, float pValue)
	{
		super(pNumber, pValue);
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
