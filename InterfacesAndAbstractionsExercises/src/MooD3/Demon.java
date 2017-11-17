package MooD3;

public class Demon extends GameObject implements Password{

    private double energy;


    public Demon(String username, double energy, int level) {
        super(username,  level);
        this.energy = energy;
    }

    @Override
    public String calculatePassword() {
        return (String.format("%s",super.getUsername().length() * 217));
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s\n%.1f ",super.getUsername(),this.calculatePassword(),this.getClass().getSimpleName(),(this.energy*super.getLevel()));
    }
}
