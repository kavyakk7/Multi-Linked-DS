package program;

/**
 * single-linked circular linked-list, acting as a square tree
 *
 */
public class Node {

	private Node down = null;
	private Node right = null;
	private Value val;
	private int xIndex;
	private int yIndex;
	private boolean invalid;

	public Node(Value v) {
		invalid = false;
		setVal(v);
		setDown(this);
		setRight(this);

	}

	/**
	 * gets the x index
	 * 
	 */
	public int getxIndex() 
	{
		return xIndex;
	}

	/**
	 * sets the x index
	 * 
	 */
	public void setxIndex(int xIndex)
	{
		this.xIndex = xIndex;
	}

	/**
	 * gets the y index
	 */
	public int getyIndex() 
	{
		return yIndex;
	}

	/**
	 * sets the y index
	 * 
	 */
	public void setyIndex(int yIndex) 
	{
		this.yIndex = yIndex;
	}

	/**
	 * gets the down node
	 * 
	 */
	public Node getDown() 
	{
		return down;
	}

	/**
	 * sets the down node
	 * 
	 */
	public void setDown(Node down)
	{
		this.down = down;
	}

	/**
	 * gets the right node
	 * 
	 */
	public Node getRight() 
	{
		return right;
	}

	/**
	 * sets the right node
	 * 
	 */
	public void setRight(Node right) 
	{
		this.right = right;
	}

	/**
	 * gets the value
	 */
	public Value getVal() 
	{
		return val;
	}

	/**
	 * sets the value
	 * 
	 */
	public void setVal(Value val) 
	{
		if (val == null) 
		{
			this.val = null;
			invalid = true;
		}
		else 
		{
			this.val = val;
		}
	}


	public boolean isInvalid() 
	{
		return invalid;
	}


	public void setInvalid(boolean invalid)
	{
		this.invalid = invalid;
	}

	/**
	 * equals method checking if nodes are equal
	 * 
	 */
	public boolean equals(Node other) 
	{
		if (this.invalid || other.invalid) 
		{
			System.out.println("One of the nodes is invalid. Cannot compare.");
			return false;
		}
		return (this.val.getDval() == other.getVal().getDval() && this.val.getSval().equals(other.getVal().getSval()) && this.xIndex == other.xIndex && this.yIndex == other.yIndex);
	}
}