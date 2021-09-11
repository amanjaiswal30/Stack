import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main
{
	public static void main(String ar[]) throws ParseException
	{
		TimeZone.setDefault(TimeZone.getTimeZone("America/Chicago"));
		Timestamp ts = new Timestamp(1629916200000L);
//		cal.setTimeInMillis(1629457675);
		if(ts!= null)
			System.out.println(ts);
		else
			System.out.println("Hello");
	}
}
