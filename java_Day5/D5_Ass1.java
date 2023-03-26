import java.util.*;

class shapes_Example{

	public static void drawShapes(List<? extends Shape> lists){
		for(Shape s:lists){
			s.draw();
		}
	}

	public static void main(String arg[]){
	 System.out.println("hello day 5 Ass 1");
	// Adding 3 Rectangles
	List<Rectangle> Rects=new ArrayList<Rectangle>();
	Rects.add(new Rectangle());
	Rects.add(new Rectangle());
	Rects.add(new Rectangle());
	drawShapes(Rects);
	//Adding 1 Circle
	List<Circle> Circ=new ArrayList<>();
	Circ.add(new Circle());
	drawShapes(Circ);

	}


}