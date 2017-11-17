package SayHello;

public class Bulgarian extends BasePerson implements Person {
    @Override
    public String getName() {
        return super.getName();
    }

    public Bulgarian(String name) {
    super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
