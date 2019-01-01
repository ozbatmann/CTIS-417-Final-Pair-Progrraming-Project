public class MotionSensorFactory implements Manufacturer {


    @Override
    public SmokeObserver createSmokeSensor(IObservable observableItem) {
        return null;
    }

    @Override
    public MotionObserver createMotionSensor(IObservable observableItem) {
        return new MotionObserver((Motion) observableItem);
    }
}
