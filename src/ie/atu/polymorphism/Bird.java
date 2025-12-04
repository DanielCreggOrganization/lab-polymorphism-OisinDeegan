package ie.atu.polymorphism;

public class Bird extends Animal{
    private double wingspan;
    
    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet! Tweet!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " flies with its " + wingspan + "cm wingspan");
    }
    
    public void soar() {
        System.out.println(name + " soars high in the sky");
    }
}
