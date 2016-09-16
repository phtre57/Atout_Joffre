package Cards;

public class BlueCard extends Card
{
	private String color = "blue" ;

	public BlueCard(int pNumber, float pValue)
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
