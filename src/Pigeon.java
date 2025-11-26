public class Pigeon extends Bird implements AnimalBehavior, AnimalMove{
    private String species;

    public Pigeon(){
        super();
        species = "idk";
    }
    public Pigeon(String name, int age, int weight, String featherColor, String species){
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(int age, String featherColor, String species){
        super(age, featherColor);
        this.species = species;
    }

    @Override
    public void Flying() {System.out.println("Pigeon flying");}

    @Override
    public void getVoice() { System.out.println("Pigeon sounds...");}
    @Override
    public void eat(String foodName) { System.out.println("Pigeon is eating something"); }

    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}

    @Override
    public void sleep(){}

    @Override
    public void move(Object ob) {
        System.out.println("Pigeon is flying. . .🪽");
    }
}
