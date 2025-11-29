import java.time.LocalDateTime;
//import java.util.logging.Level;




public class SmartLogger implements Logger{
    int i=1;
    public void log(String msg){
        //java.util.logging.Logger — log(Level ERROR, String msg)

        if (msg.contains("error")){
            System.out.println(System.Logger.Level.ERROR +  " " + LocalDateTime.now() + " " + msg);
        } else {
            System.out.println(System.Logger.Level.INFO + "#" + getSequenceNumber(i++) + " " + LocalDateTime.now() + " " + msg);
        }
    }


    private long getSequenceNumber(int i) {
        return i;
    }




}

