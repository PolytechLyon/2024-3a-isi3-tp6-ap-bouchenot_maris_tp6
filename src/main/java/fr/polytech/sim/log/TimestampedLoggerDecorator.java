package fr.polytech.sim.log;

import javax.naming.Name;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TimestampedLoggerDecorator implements Logger {
    private Logger compose;

    public TimestampedLoggerDecorator(Logger logger)
    {
        compose = logger;
    }
    @Override
    public void log(String format, Object... args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        String msg = " " + format +" "+ formattedDateTime;
        compose.log(msg,args);
    }
}

