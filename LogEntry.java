import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogEntry {
    private String content; 
    private String timestamp;

    public LogEntry(String content){

        this.content = content;
        // Automatically set the time when a log is created
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss") );
    }
    @Override
    public String toString() {
        return "[" + timestamp + "]" + content;
    }
    // Getters
    public String getContent(){
         return content; }
    public String getTimestamp (){
         return timestamp; }
    }