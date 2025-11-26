public class Blowfish extends Fish implements AnimalBehavior, AnimalMove{
    private String Spikes;

    public Blowfish() {
        super();
        Spikes = "idk";
    }
    public Blowfish(String name, int age, int weight, String isSwimming, String Spikes) {
        super(name, age, weight, isSwimming);
        this.Spikes = Spikes;
    }

    public Blowfish(int age, String isSwimming, String Spikes) {
        super(age, isSwimming);
        this.Spikes = Spikes;
    }

    @Override
    public void Defending() {System.out.println("Blowfish uses spikes");}
    @Override
    public void getVoice() { System.out.println("Blowfish says 'eught'");}
    @Override
    public void eat(String foodName) { System.out.println("Blowfish is eating: " + foodName); }


    public String getSpikes() {return Spikes;}
    public void setSpikes(String Spikes) {this.Spikes = Spikes;}

    @Override
    public void sleep() {}

    @Override
    public void move(Object ob) {
        System.out.println("Blowfish is swimming away..🐡🏊‍♂️");
    }
}
