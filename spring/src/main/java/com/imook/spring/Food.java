package com.imook.spring;

public class Food {
	private String foodname;
public Food()
{
	
}
/**
 * @return the foodname
 */
public String getFoodname() {
	return foodname;
}
/**
 * @param foodname the foodname to set
 */
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public Food(String foodname) {
	super();
	this.foodname = foodname;
}
public void eatfood()
{
	System.out.println("调用了food对象");
}
}
