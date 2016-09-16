package Cards;

public abstract class Card
{
	public final static int MIN_NUMBER = 0;
	public final static int MAX_NUMBER = 7;
	public final static float NORMAL_CARD_VALUE = (float) 0.25;
	public final static float KAISER_CARD_VALUE = (float) -2.75;
	public final static float JOFFRE_CARD_VALUE = (float) 5.25;

	private int number;
	private float value;
	
	

	public Card(int pNumber, float pValue)
	{
		if(validateNumber(pNumber) && validateValue(pValue))
		{
		this.number = pNumber;
		this.value = pValue;
		}
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int pNumber)
	{
		if (validateNumber(pNumber))
		{
			this.number = pNumber;
		}
	}

	public float getValue()
	{
		return value;
	}

	public void setValue(float pValue)
	{
		if (validateValue(pValue))
		{
			this.value = pValue;
		}
	}

	public static boolean validateNumber(int pNumber)
	{
		return (pNumber >= MIN_NUMBER && pNumber <= MAX_NUMBER);
	}

	public static boolean validateValue(float pValue)
	{
		return (pValue == NORMAL_CARD_VALUE || pValue == KAISER_CARD_VALUE
				|| pValue == JOFFRE_CARD_VALUE);
	}
	
	public abstract String getColor();
	public abstract void setColor(String pColor);

}
