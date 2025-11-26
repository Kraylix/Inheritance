public class Bird extends Animal implements AnimalMove{
    private String featherColor;

    public Bird(){
        super();
        featherColor = "idk";
    }
    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(int age, String featherColor){
        super(age);
        this.featherColor = featherColor;
    }

    public void Flying() {System.out.println("...flying... ");}

    @Override
    public void getVoice() { System.out.println("bird sounds...");}
    @Override
    public void eat(String foodName) { System.out.println("bird is eating: " + foodName); }

    public String getFeatherColor() {return featherColor;}
    public void setFeatherColor(String featherColor) {this.featherColor = featherColor;}

}
