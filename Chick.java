class Chick extends Cow
{     
    private String myType;
    private String mySound;
    private String myother;
    public Chick(String type, String sound, String other)
    {
    	myType=type;
    	mySound=sound;
    	myother=other;
    }
    public Chick() 
    {
    	myType="unknown";
    	mySound="unknown";
    	myother="unknown";
    }
	public String getSound()
	{
		if (Math.random() < 0.5)
			return myother;
				return mySound;
	}
	public String getType()
	{
		return myType;
	}
}
