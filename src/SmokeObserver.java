
public class SmokeObserver extends Sensor implements ICommand {
    WaterSprinkler waterSprinkler = new WaterSprinkler();
    Smoke smoke;

    SmokeObserver(Smoke smoke){
        this.smoke = smoke;
    }

    @Override
    public void update(String state) {

       smoke.state = state;
       if (smoke.getState().equals("Active")) execute();
       if (smoke.getState().equals("Passive")) unexecute();
    }

    public void execute(){
        System.out.println("Smoke is detected");
        waterSprinkler.turnOn();
        Process p = new Process(waterSprinkler.turnOn());
        FormatType formatType = FormatType.FORMAT1;
        Sms.setContent(p);
        super.setProcess(p);
        super.sendSms(formatType);

    }
    public void unexecute(){
        waterSprinkler.turnOff();
        Process p = new Process(waterSprinkler.turnOff());
        super.setProcess(p);

    }
}
