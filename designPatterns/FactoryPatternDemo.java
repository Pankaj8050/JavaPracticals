package designPatterns;

interface Shape {
	
	void draw();
}

    class Rectangle implements Shape {

	@Override
	public void draw() {
		
		System.out.println("drawing Rectangle : inside draw() of rectangle ");
	}
   }
	
	class Circle implements Shape{

		@Override
		public void draw() {
			System.out.println("Drawing Circle : inside draw() of Circle ");
			
		}
	}
	class Square implements Shape{

		@Override
		public void draw() {
			System.out.println("Drawing Square : inside draw() of Square");
			
		}
	}	
	class ShapeFactory{
		public Shape getShape(String shapeType) {
			
			if (shapeType.equalsIgnoreCase("Circle"))
			   return new Circle();
			 else if (shapeType.equalsIgnoreCase("Rectangle"))
				   return new Rectangle();
			 else if (shapeType.equalsIgnoreCase("Square"))
				 return new Square();
			 else 
				 return null;
			
		}
	}

     public class FactoryPatternDemo {

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
       ShapeFactory obj= new ShapeFactory();
		
		Shape circle=obj.getShape("circle");
		circle.draw();
		
		Shape rect=obj.getShape("Ractangle");
		rect.draw();
		
		Shape square=obj.getShape("Square");
		square.draw();
	}
}
