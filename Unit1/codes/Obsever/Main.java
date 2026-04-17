package Unit1.codes.Obsever;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber sub1 = new ConcreteSubscriber("Sistema de Log");
        Subscriber sub2 = new ConcreteSubscriber("Interface de Usuário");

        publisher.subscribe(sub1);
        publisher.subscribe(sub2);

        publisher.unsubscribe(sub2);
        publisher.mainBusinessLogic("Processo Iniciado");

        publisher.mainBusinessLogic("Processo Finalizado");
    }
}