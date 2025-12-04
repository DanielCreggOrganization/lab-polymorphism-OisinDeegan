package ie.atu.polymorphism;

public class Square extends Shape {
    private int length;

    public Square(int length, String color){
        this.length=length;
        super(length, color);
    }
    public double getDiagonal(){
        return Math.sqrt((length)+(length));
    }
    @Override
    public int getPerimeter() {
        return length*4;        
    }
    @Override
    public String describe(){
        return "The square has an edge length of "+length+", a perimeter of "+getPerimeter()+" and a color of "+getColor();
    }
}
