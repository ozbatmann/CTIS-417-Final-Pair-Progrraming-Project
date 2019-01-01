public class Main {

    public static void main(String[] args) {
        HSS hss = new HSS();

        Manufacturer smokeSensorFactory = new SmokeSensorFactory();
        Manufacturer motionSensorFactory = new MotionSensorFactory();

        IObservable motion = new Motion();
        IObservable smoke = new Smoke();




      SmokeObserver smokeSensor = smokeSensorFactory.createSmokeSensor(smoke);
      MotionObserver motionSensor = motionSensorFactory.createMotionSensor(motion);


      hss.setSmokeSensor(smokeSensor);
      hss.setMotionSensor(motionSensor);


      smoke.add(hss.getSmokeSensor());

      motion.add(hss.getMotionSensor());



    ((Smoke) smoke).setState(StateTypes.ACTIVE.getState());

    ((Smoke) smoke).setState(StateTypes.PASSIVE.getState());

    ((Motion) motion).setState(StateTypes.ACTIVE.getState());
    ((Motion) motion).setState(StateTypes.PASSIVE.getState());



    }
}
