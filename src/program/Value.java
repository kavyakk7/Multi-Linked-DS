package program;


public class Value {

	private double dval;
	private String sval;
	private String tag;

	public Value(String input) 
	{
		tag = "STR";
		if (input.startsWith("\"")) 
		{
			sval = input.substring(1);

		}
		else 
		{
			System.out.println("Cannot instantiate a Value object with this input.");
			tag = "INVALID";
		}
	}

	
	public Value(double input) 
	{
		tag = "DBL";
		dval = input;
	}

	/**
	 * adds the value of v1 to the current value and returns a new instance of a
	 * value to be placed used elsewhere in the program
	 * 
	 */
	public Value add(Value v1) 
	{
		Value val = null;
		if (this.getTag().equals("DBL") && v1.getTag().equals("DBL")) 
		{
			val = new Value(this.getDval() + v1.getDval() + "");
		}
		else 
		{
			tag = "INVALID";
		}
		return val;
	}

	/**
	 * returns a string depending on the tag
	 * 
	 */
	public String toString() 
	{
		String t = "";
		if (tag.equals("DBL")) 
		{
			t = String.format("%10.4f", dval);
		} 
		else if (tag.equals("STR")) 
		{
			t = String.format("%10s", sval);
		} 
		return String.format("%15s", t);
	}

	/**
	 * gets the tag
	 * 	 */
	public String getTag()
	{
		return tag;
	}

	/**
	 * sets the tag
	 * 
	 */
	public void setTag(String f)
	{
		tag = f;
	}

	/**
	 * gets the string value
	 * 
	 */
	public String getSval()
	{
		return sval;
	}

	/**
	 * sets the sval
	 * 
	 */
	public void setSval(String sval)
	{
		this.sval = sval;
	}

	/**
	 * gets the dval
	 * 
	 */
	public double getDval() 
	{
		return dval;
	}

	/**
	 * sets the dval
	 * 
	 */
	public void setDval(double dval) 
	{
		this.dval = dval;
	}
}