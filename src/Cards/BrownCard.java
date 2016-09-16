package Cards;

public class BrownCard extends Card
{
	private String color = "brown" ;

	public BrownCard(int pNumber, float pValue)
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
