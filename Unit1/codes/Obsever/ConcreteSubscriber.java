package Unit1.codes.Obsever;

public class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String context) {
        System.out.println("Concrete Subscriber [" + name + "] ---> new state: " + context);
    }
}
