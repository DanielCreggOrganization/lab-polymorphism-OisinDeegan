package ie.atu.polymorphism;

public class Elephant extends Animal {
    private int weight;
    public Elephant (String name, int age, int weight){
        super(name, age);
        this.weight=weight;
    }
    @Override
    public void makeSound(){
        System.out.println(name + " trumpets: BOOWOMP!");
    }
    @Override
    public void move(){
        System.out.println(name+" shakes the ground with its "+weight+"kg weight!");
    }
    public void trunk(){
        System.out.println(name+" paints a lovely picture with its trunk");
    }
}
