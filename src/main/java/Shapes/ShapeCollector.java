package Shapes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector  {
    List<Object> list = new ArrayList<Object>();

    public void addFigure(Shape shape){
    list.add(shape);
    }

    public void removeFigure(Shape shape){
        list.remove(shape);
    }
    public void getFigure(int n){
        list.get(n);

    }
    public void showFigures(){
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "list=" + list +
                '}';
    }
}
