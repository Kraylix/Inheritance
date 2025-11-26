class Main
{
    public static void main (String[] args)
    {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Elephant🐘",20,120,"African Elephant");
        animal[1] = new Dog("Aska", 10, 28, "Golden Retriever", "I'm defending baby, gimme treat");
        animal[2] = new Bird("Crow🐦‍⬛",5,7, "Black");
        animal[3] = new Pigeon("ThiefKing🐦",3,4,"Red&White","Red Swallow");
        animal[4] = new Fish("Carp🐟",2,6,"Yes");
        animal[5] = new Blowfish("Fuku",6,1,"Yes","Using Spikes");

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0] = new Dog("Aska", 10, 28, "Golden Retriever", "I'm still defending baby, gimme more treat");
        animalBehavior[1] = new Pigeon("ThiefKing🐦(Brother)", 10, 2, "Black&Gray", "Dragoon");
        animalBehavior[2] = new Blowfish("PufferFishCarrot", 6, 1,"No More", "No more using Spikes");

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();

        for (Animal a : animal){
            AnimalName.name(a.getName());
            a.move(animal);
            a.getVoice();
            if(a instanceof Mammal mammal) // checking whether "a" we named that we named animal has his own child class,
            {                             // if so it shows method drinkBeer(dog only have that) to every Mammal (dog only one)
                mammal.drinkBeer();
            }
            a.eat("Small pieces of meat");  // all of them can eat meat for sure, so I made this to do not say that some eat this, some eat that, sorry 😵
        }
    }
}