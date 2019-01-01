public interface IObservable {

    void add(IObserver iObserver);
    void notifyObservers(String state);
}
