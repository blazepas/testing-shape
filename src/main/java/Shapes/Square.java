package Shapes;

public class Square implements Shape {
    protected String name = "square";
    protected String field = "20";

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
        return "Square{" +
                "name='" + name + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
