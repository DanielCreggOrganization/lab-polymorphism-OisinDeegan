package ie.atu.polymorphism;

public class Shape {
    private String color;
    private int perimeter;

    public Shape(int input, String color){
        this.color=color;
        perimeter=input;
    }

    public int getPerimeter(){
        return perimeter;
    }
    public int getArea(){
        return perimeter^2;
    }
    public void setPerimeter(int input){
        perimeter=input*input;
    }
    public String getColor(){
        return color;
    }
    public String describe(){
        return "The shape has a color of "+color+" and a perimeter of "+perimeter;
    }
}
