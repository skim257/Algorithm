package Logic_1;
/*Logic-1 > alarmClock
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
alarmClock(1, false) ¡æ "7:00"
alarmClock(5, false) ¡æ "7:00"
alarmClock(0, false) ¡æ "10:00"*/
public class a6_alarmClock {
	public String alarmClock(int day, boolean vacation) {
		  String alarm="";
		  if(day>0&&day<6&&vacation==false)
		  alarm="7:00";
		  if(day==0||day==6||vacation==true)
		  alarm="off";
		  if(day==0||day==6&&vacation==false)
		  alarm="10:00";
		  if(day>0&&day<6&&vacation==true)
		  alarm="10:00";
		  return alarm;
		}
	
	// Solution
    public String salarmClock(int day, boolean vacation) {
        if (day > 0 && day < 6 && !vacation) return "7:00";
        if (day < 1 && !vacation || day > 5 && !vacation || day > 0 && day < 6 && vacation) return "10:00";
        return "off";
    }
}
