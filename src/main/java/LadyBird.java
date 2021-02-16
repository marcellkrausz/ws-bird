public class LadyBird implements Flying, Feed {

    private String name;
    private boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public String fly() {
        return "Buzz, Buzz";
    }

    @Override
    public String feed() {
        return "I love aphid";
    }

    @Override
    public String speak() {
        return "says";
    }
}
