package ie.atu.polymorphism;

public class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
    
    public void move() {
        System.out.println(name + " moves around");
    }
    
    public String getInfo() {
        return name + " (" + age + " years old)";
    }
}
