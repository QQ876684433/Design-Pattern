public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }
        if (color.equalsIgnoreCase("green")){
            return new Green();
        }
        if (color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
