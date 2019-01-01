
public abstract class Sensor implements IObserver{

    private Process process;

    public void setProcess(Process process) {
        this.process = process;
        HSS.addProcess(this.process);
    }
    public void sendSms(FormatType formatType) {
        HSS.sendSms(formatType);
    }
}