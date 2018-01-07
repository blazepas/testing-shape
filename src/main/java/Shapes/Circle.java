package Shapes;

public class Circle implements Shape {
    protected String name = "circle";
    protected String field = "15";

    @Override
    public String getShapeName() {
        this.name = name;
        return name;
    }

    @Override
    public String getField() {
        this.field = field;
        return field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
