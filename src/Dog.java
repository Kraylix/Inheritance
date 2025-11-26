public class Dog extends Mammal implements AnimalBehavior, AnimalMove{
    private String babySitting;

    Dog() {
        super();
        babySitting = "idk";
    }
    public Dog(String name, int age, int weight, String breed, String babySitting) {
        super(name, age, weight, breed);
        this.babySitting = babySitting;
    }

    public Dog(int age, String breed, String babySitting){
        super(age, breed);
        this.babySitting = babySitting;
    }

    public void protecting() {System.out.println("Dog is protecting baby\n"); }
    @Override
    public void drinkBeer() { System.out.println("Dog is drinking bear. . . yeah.");}
    @Override
    public void getVoice() { System.out.println("Dog is barking woof-awoof");}
    @Override
    public void eat(String foodname) { System.out.println("Dog is eating " + foodname);}

    public String getBabySitting() {return getBabySitting();}
    public void setBabySitting(String babySitting) {this.babySitting = babySitting;}

    @Override
    public void sleep() {System.out.println(getName() + "Dog is sleeping");}

    @Override
    public void move(Object ob) {
        System.out.println("Dog is running . . .🐕");
    }
}
