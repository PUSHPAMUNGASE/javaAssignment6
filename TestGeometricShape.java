package assignment3oct;

public class TestGeometricShape {
	
	public static void main(String[] args) {
		 
		Circle circle=new Circle(23);
		Rectangle rectangle=new Rectangle(23,23);
		Triangle triangle=new Triangle(2,4,5);
		circle.Area();
		circle.Perimeter();
		rectangle.Area();
		rectangle.Perimeter();
		triangle.Area();
		triangle.Perimeter();
	}

}
