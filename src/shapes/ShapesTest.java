package shapes;

public class ShapesTest {
        public static void main(String[] args){
//            Rectangle box1 = new Rectangle(5, 4);
//            box1.getPerimeter();
//            box1.getArea();
//
//            Rectangle box2 = new Square(5); //just want to pass side, side overwrites Rectangles length and width parameters
//            box2.getPerimeter();
//            box2.getArea();
            Measurable myShape = new Square(5);
            System.out.println(myShape.getArea());
            System.out.println(myShape.getPerimeter());
            Measurable myOtherShape = new Rectangle(2, 10);
            System.out.println(myOtherShape.getArea());
            System.out.println(myOtherShape.getPerimeter());

        }
}



