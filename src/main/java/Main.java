public class Main {

    public static void main(String[] args) {
        LadyBird ladyBird1 = new LadyBird("Bence",true);
        LadyBird ladyBird2 = new LadyBird("Zsolt",true);
        Bird bird1 = new Bird("Jani", false);
        Bird bird2 = new Bird("Ádám",false);

        ladyBird1.fly();
        ladyBird2.fly();
        bird1.fly();
        bird2.fly();

        ladyBird1.feed();
        ladyBird2.feed();
        bird1.feed();
        bird2.feed();
    }
//    Create a Bird class with a name, and isFemale field
//    Create a LadyBird class with a name and isFemale field
//    Create a Flying interface with a method void fly()
//    Bird and LadyBird must implement Flying
//    When Bird flies, it “says” Csájp, Csájp
//    When LadyBird flies, it says “Buzz, Buzz”
//    Implement feed() method in both classes.
//    When LadyBird feeds it says: “I love aphid”
//    When Bird feeds it says, “What a wonderful worm”
//    When I say “says” call speak()
//    Did you create Feed Interface already? Than it is time:)
//    Call fly() on 2 LadyBird and 2 Bird in Main with a method: fly()
//    Call feed() on 2 LadyBird and 2 Bird in Main with a method: feed()

}
