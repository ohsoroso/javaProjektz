package animalObjects;

public class Animal {
	private int weight;
	private int age;
	private int height;
	
	public Animal(int weight, int age, int height)
	{
		SetWeight(weight);
		SetAge(age);
		SetHeight(height);
	}
	
	public void SetWeight(int weight)
	{
		this.weight = weight;
	}

	public void SetAge(int age)
	{
		this.age = age;
	}

	public void SetHeight(int height)
	{
		this.height = height;
	}
	
	public int GetWeight()
	{
		return weight;
	}

	public int GetAge()
	{
		return age;
	}

	public int GetHeight()
	{
		return height;
	}
	
	public String toString()
	{
		return "I weigh " + weight + " pounds.\nI am " + age + " years old.\nI am " + height + " inches tall.";
	}

}
