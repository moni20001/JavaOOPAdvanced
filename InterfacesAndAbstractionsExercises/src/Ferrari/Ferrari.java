package Ferrari;

public class Ferrari implements Car{
    private String name;
    private String model;

    public Ferrari(String name) {
        this.name = name;
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
       return "Brakes!";
    }

    @Override
    public String gasPedal() {
       return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.model,this.brakes(),this.gasPedal(),this.name);
    }
}
