package Assignmentoct3;

abstract public class GeometricShape1 {
	

		abstract public void Area();

		abstract public void Perimeter();

	}

	class Circle extends GeometricShape1 {

		protected float radius;
		final double PI = 3.14;

		public Circle(float radius2) {
		
			radius = radius2;

		}

		public void Area() {
			double area = PI * radius * radius;
			System.out.println("The area of circle is = " + area);

		}

		@Override
		public void Perimeter() {

			double perimeter = 2 * PI * radius;

			System.out.println("The Perimete of circle is = " + perimeter);
		}

	}

	class Rectangle extends GeometricShape1 {
		protected double length;
		protected double breadth;

		public Rectangle(  double length, double breadth) {
		
			this.length = length;
			this.breadth = breadth;
		}

		public void Area() {

			double area = length * breadth;
			System.out.println("The area of rectangle is = " + area);

		}

		@Override
		public void Perimeter() {

			double perimeter = 2 * (length + breadth);

			System.out.println("The Perimete of rectangle  is = " + perimeter);
		}

	}


	class Triangle extends GeometricShape1 {

	    protected  double base;
	    protected double height;
	    protected double thirdSide;
		
	    
		
		public Triangle(double base, double height, double thirdSide) {
			super();
			this.base = base;
			this.height = height;
			this.thirdSide = thirdSide;
		}

		public void Area() {
			 
			 
				double area=0.5*base*height;
				System.out.println("The area of triangle is = "+area);
				
			}

		@Override
			public void Perimeter() {
				
				double perimeter=base+height+thirdSide;
				
				System.out.println("The Perimete of triangle is = "+ perimeter);
			}
	}

