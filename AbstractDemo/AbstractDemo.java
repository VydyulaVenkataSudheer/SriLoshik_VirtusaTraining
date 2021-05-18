
public class AbstractDemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.setColor("blue");
		double circle=c.calculateArea();
		System.out.println("circle Area is "+circle);
		
		
		Square s=new Square();
		s.setColor("orange");
	double square=	s.calculateArea();
	System.out.println("square Area is "+square);
		
	}

}
