package Unit1.codes.Obsever;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    // Lista de assinantes
    private List<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(mainState);
        }
    }

    public void mainBusinessLogic(String newState) {
        System.out.println("\nPublisher: Mudando o estado principal para '" + newState + "'...");
        this.mainState = newState;
        
        notifySubscribers();
    }
}