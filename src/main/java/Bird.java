public class Bird implements Flying, Feed {

    private String name;
    private boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public String fly() {
        return "Csájp, Csájp";
    }

    @Override
    public String feed() {
        return "What a wonderful worm";
    }

    @Override
    public String speak() {
        return "says";
    }
}
