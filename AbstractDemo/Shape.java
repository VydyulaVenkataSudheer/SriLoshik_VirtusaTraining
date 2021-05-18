
public abstract class Shape {
	String color;
	abstract public double  calculateArea();
    public void setColor(String color)
    {
    	this.color=color;
    	System.out.println("color is "+color);
    }
}
