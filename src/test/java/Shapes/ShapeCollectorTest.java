package Shapes;
import org.junit.Test;

import java.util.Iterator;

public class ShapeCollectorTest {
    ShapeCollector shapeCollector = new ShapeCollector();
    Square square1 = new Square();
    Triangle triangle2 = new Triangle();
    Circle circle3 = new Circle();

    @Test
    public void addFigure() throws Exception {
       // assertTrue(shapeCollector.list.add(square1));
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(circle3);
     System.out.println(shapeCollector);
    }

    @Test
    public void removeFigure() throws Exception {
        shapeCollector.removeFigure(square1);
    }

    @Test
    public void getFigure() throws Exception {
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle2);
       shapeCollector.getFigure(1);

//        Object m = shapeCollector.list;
//        Iterator itr;
//        itr = shapeCollector.list.iterator();
//        //traversing elements of ArrayList object
//        while(itr.hasNext()){
//            itr.next();
//            System.out.println(shapeCollector.+" "+st.name+" "+st.age);

        }

    @Test
    public void showFigures() throws Exception {
        shapeCollector.showFigures();
    }

    @Test
    public void getShapeName() throws Exception {
        System.out.println("Geometrical shape: " + triangle2.getShapeName());
        System.out.println("Geometrical shape: " + circle3.getShapeName());
        System.out.println("Geometrical shape: " + square1.getShapeName());
    }

    @Test
    public void getField() throws Exception {
        System.out.println("Triangle field: " + triangle2.getField());
        System.out.println("Circle field: " + circle3.getField());
        System.out.println("Square field: " + square1.getField());
    }

}