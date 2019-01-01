public class MotionObserver extends Sensor implements ICommand {
    Alarm alarm = new Alarm();
    Motion motion;

    MotionObserver(Motion motion){
        this.motion = motion;
    }

    @Override
    public void update(String state) {
        motion.state = state;
        if (motion.getState().equals("Active")) execute();
        if (motion.getState().equals("Passive")) unexecute();
    }

    public void execute(){
        System.out.println("Motion is detected");
        alarm.turnOn();
        Process p = new Process(alarm.turnOn());
        FormatType formatType = FormatType.FORMAT2;
        Sms.setContent(p);
        super.setProcess(p);
        super.sendSms(formatType);
    }
    public void unexecute(){
        alarm.turnOff();
        Process p = new Process(alarm.turnOff());
        super.setProcess(new Process(alarm.turnOff()));
    }

}
