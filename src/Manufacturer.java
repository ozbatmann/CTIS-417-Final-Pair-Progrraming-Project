public interface Manufacturer {

     SmokeObserver createSmokeSensor(IObservable observableItem);
     MotionObserver createMotionSensor(IObservable observableItem);

}
