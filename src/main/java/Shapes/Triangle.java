package Shapes;

public class Triangle implements Shape {
    protected String name = "triangle";
    protected String field = "44";

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public String getField() {
        return null;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
