package oopDesignConceptsL8.polymorphism;

public class Square extends Rectangle{
    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public void setHeight(double height){
        super.setHeight(height);
        super.setWidth(height);
    }
}
