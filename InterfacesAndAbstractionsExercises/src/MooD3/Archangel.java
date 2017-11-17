package MooD3;

public class Archangel extends GameObject implements Password {

    private int mana;

    public Archangel(String username,int mana, int level) {
        super(username, level);
        this.mana = mana;
    }

    @Override
    public String calculatePassword() {
        StringBuilder str = new StringBuilder();
        str.append(super.getUsername()).reverse();
        return str.toString() + String.format("%s",super.getUsername().length()*21);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s\n%d ",super.getUsername(),this.calculatePassword(),this.getClass().getSimpleName(),(this.mana*super.getLevel()));
    }
}
