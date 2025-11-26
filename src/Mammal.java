public class Mammal extends Animal implements AnimalMove, AnimalName{
    private String animName;

    Mammal(){
        super();
        animName = "idk";
    }

    public Mammal(String name, int age, int weight, String animName) {
        super(name, age, weight);
        this.animName = animName;
    }

    public Mammal(int age, String waiting) {
        super(age);
        this.animName = animName;
    }

    public void drinkBeer() { System.out.println("Sluuuuuughrp eagh"); }
    @Override
    public void getVoice() { System.out.println("Mammal sounds..."); }
    @Override
    public void eat(String foodName) { System.out.println("Mammal is eating: " + foodName); }

    public String getaAimName() { return animName; }
    public void setAnimName(String animName) { this.animName = animName; }
}
