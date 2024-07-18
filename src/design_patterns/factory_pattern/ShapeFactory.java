package design_patterns.factory_pattern;

public class ShapeFactory {
    public Shape getShape(String shapeName){
        if(shapeName.equals("CIRCLE"))
            return new Circle();
        else if(shapeName.equals("SQUARE"))
            return new Square();
        else if(shapeName.equals("RECTANGLE"))
            return new Rectangle();
        else return null;
    }
}
