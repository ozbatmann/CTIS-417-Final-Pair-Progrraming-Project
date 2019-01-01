import java.util.ArrayList;

public class HSS {

   private static ArrayList<Process> processes;
   private static SingletonLogWriter singletonLogWriter;
   private static SmsAdapter smsAdapter;
   private  SmokeObserver smokeSensor;
   private  MotionObserver motionSensor;

   HSS(){
       processes = new ArrayList<>();
       singletonLogWriter = SingletonLogWriter.getInstance();
   }

    public static void addProcess(Process process) {
        processes.add(process);
        System.out.println(process.getProcessMessage());
        singletonLogWriter.log(process);
    }

    public static void sendSms(FormatType formatType) {

        smsAdapter = new SmsAdapter(formatType);
        smsAdapter.format();
    }

    public  SmokeObserver getSmokeSensor() {
        return smokeSensor;
    }

    public void setSmokeSensor(SmokeObserver smokeObserver) {
        smokeSensor = smokeObserver;
    }

    public MotionObserver getMotionSensor() {
        return motionSensor;
    }

    public  void setMotionSensor(MotionObserver motionObserver) {
      motionSensor = motionObserver;
    }
}
