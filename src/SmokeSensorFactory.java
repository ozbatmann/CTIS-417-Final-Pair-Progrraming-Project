public class SmokeSensorFactory implements Manufacturer {


    @Override
    public SmokeObserver createSmokeSensor(IObservable observableItem) {
        return new SmokeObserver((Smoke) observableItem);
    }

    @Override
    public MotionObserver createMotionSensor(IObservable observableItem) {
        return null;
    }
}
