package oopDesignConceptsL8.polymorphism;

public class LiskovSubstitution {
    public static void main(String[] args) {
        new LiskovSubstitution().apply();
    }

    public void apply() {
        double height = 2.0;
        double width = 3.0;

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Created Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());

        Square square = new Square(width, height);
        square.setHeight(height);
        square.setWidth(width);

        System.out.println("Created Square with width: " + square.getWidth() + " and height: " + square.getHeight());
    }

}
