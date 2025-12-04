package ie.atu.polymorphism;

public class Circle extends Shape{
    private double circumference;

    public Circle (String input, int radius){
        circumference=2*(22/7)*radius;
        super(radius, input);
    }

    public double getCircumference(){
        return circumference;
    }

    public String describe(){
        return "The circle has a circumference of "+getCircumference()+" and a color of "+getColor();
    }
}
