import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLogWriter {

    private final String logFile = "log.txt";
    private PrintWriter writer;
    private static SingletonLogWriter instance;


    private SingletonLogWriter(){
        try{
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw,true);
        }catch (IOException ex){
            ex.getMessage();
        }
    }

    public static SingletonLogWriter getInstance(){
        if(instance == null){
            instance = new SingletonLogWriter();
        }
        return instance;
    }
    public void log(Process p){
            writer.println(p.getProcessMessage());
    }


}
