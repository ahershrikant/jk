package AssertionPro;
import java.io.*;
import java.time.*;
import java.util.Date;

public class dateCheck {
     static boolean local=true;
	public static void main(String[] args) {
		 // first create date object
		assert local;
        Date current = new Date();
          
        // first create instant object using
        // Instant.ofEpochMilli(date.getTime()) than add
        // zoneId using .atZone() at last convert into
        // localDate using toLocalDate()
        LocalDate local = Instant.ofEpochMilli(current.getTime())
                  .atZone(ZoneId.systemDefault())
                  .toLocalDate();
        
        
        System.out.println(local);
	}

}
