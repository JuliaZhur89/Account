import java.time.LocalDateTime;

public class SimpleLogger implements Logger{
    public void log(String msg){
        System.out.println(LocalDateTime.now() + msg);
    }
}
