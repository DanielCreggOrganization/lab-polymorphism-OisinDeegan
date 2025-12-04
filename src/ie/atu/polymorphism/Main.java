package ie.atu.polymorphism;

public class Main {
    public static void main(String[] args) {
        Square cube = new Square(4, "green");
        Circle sphere = new Circle("blue", 5);
        PriceCalculator calc = new PriceCalculator();

        System.out.println(cube.describe());
        System.out.println(sphere.describe());

        System.out.println("Default price: "+calc.calculatePrice(50));
        System.out.println("Discount of 20%: "+calc.calculatePrice(50, 20));
        System.out.println("Student Discount: "+calc.calculatePrice(50, true));
        System.out.println("With 20% AND Student discount: "+calc.calculatePrice(50, 20, true));

        Square square = new Square(5, "red");
        Shape shape=square;

        System.out.println(shape.getPerimeter());

        if(shape instanceof Square){
            Square downcastedShape = (Square) shape;
            System.out.println(downcastedShape.getDiagonal());
        }
        Circle circle = new Circle("purple", 4);
        Shape circShape = circle;

        System.out.println(circShape.describe());

        if(circShape instanceof Circle){
            Circle downcastCircShape=(Circle) circShape;
            System.out.println(downcastCircShape.getCircumference());
        }

        AnimalShelter shelter = new AnimalShelter();
        
        // Adding different types of animals
        shelter.addAnimal(new Dog("Buddy", 5, "Golden Retriever"));
        shelter.addAnimal(new Cat("Whiskers", 3, true));
        shelter.addAnimal(new Bird("Tweety", 1, 15.5));
        shelter.addAnimal(new Dog("Rex", 7, "German Shepherd"));
        shelter.addAnimal(new Elephant("Jumbo", 23, 600));
        
        // Demonstrate common behaviors
        shelter.makeAllSounds();
        
        // Demonstrate type-specific behaviors
        shelter.exerciseAnimals();
        shelter.roleCall();
    }
}
