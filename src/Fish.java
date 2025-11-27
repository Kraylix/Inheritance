public class Fish extends Animal implements AnimalMove{
    private String isSwimming;

    Fish(){
        super();
        isSwimming = "idk";
    }
    public Fish(String name, int age, int weight, String isSwimming) {
        super(name, age, weight);
        this.isSwimming = isSwimming;
    }
    public Fish(int age, String isSwimming)
    {
        super(age);
        this.isSwimming = isSwimming;
    }

    public void Defending() {System.out.println("Fish is defending himself");}
    @Override
    public void getVoice() { System.out.println("Fish sounds...");}
    @Override
    public void eat(String foodName) { System.out.println("Fish is eating: " + foodName); }

    public String getIsSwimming() {return isSwimming;}
    public void setIsSwimming(String isSwimming) {this.isSwimming = isSwimming;}
}
