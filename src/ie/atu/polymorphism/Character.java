package ie.atu.polymorphism;

public class Character {
    private String name;
    private int health;
    private Position location;
    public Character(String name, int health){
        this.name=name;
        this.health=health;
        this.location=new Position(0,0);
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int changeHealth(int change){
        health+=change;
        return health;
    }
    public Position getLocation(){
        return location;
    }
    public void move(int newX, int newY){
        Position newLocation= new Position(location.getX()+newX, location.getY()+newY);
        location = newLocation;
        System.out.println("Moved"+name+" to " + location);
    }
    public void attack(int damage){
        if (Math.random()>0.5) {
            System.out.println("You hit, and deal "+damage+" damage!");
        } else {
            System.out.println("You miss, how sad");
        }
    }
    public void defend(int damage){
        if (Math.random()>0.5) {
            System.out.println("You don't get hurt, great job!");
        } else {
            System.out.println("You are hurt, and take "+damage+" damage");
            health-=damage;
        }
    }
    public String describe(){
        return "Character "+name+" has "+health+" health and is at location "+location;
    }
}
