import java.util.ArrayList;

public class Smoke implements IObservable {
    ArrayList<IObserver> observers = new ArrayList<>();
    String state;

    Smoke(){ }

    @Override
    public void add(IObserver iObserver) {
        observers.add(iObserver);
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(this.state);
    }


    @Override
    public void notifyObservers(String state) {
        for(IObserver obs: observers){
            obs.update(state);
        }
    }
}
