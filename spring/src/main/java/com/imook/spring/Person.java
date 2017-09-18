package com.imook.spring;

public class Person {
	public String name;
	public String id;
	private Food food;
	
public Person(String name, String id, Food food) {
		super();
		this.name = name;
		this.id = id;
		this.food = food;
	}

/**
	 * @return the food
	 */
	public Food getFood() {
		return food;
	}

	/**
	 * @param food the food to set
	 */
	public void setFood(Food food) {
		this.food = food;
	}

public Person() {
		super();
	}

/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

public void eat()
{
	System.out.println("人吃东西");
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + "]";
}

}
