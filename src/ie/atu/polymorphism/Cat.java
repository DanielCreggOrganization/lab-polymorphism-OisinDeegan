package ie.atu.polymorphism;

public class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " prowls gracefully");
    }
    
    public void scratch() {
        System.out.println(name + " scratches the " + 
            (isIndoor ? "furniture" : "tree"));
    }
}
