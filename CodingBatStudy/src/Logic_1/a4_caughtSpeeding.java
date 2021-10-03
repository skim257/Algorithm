package Logic_1;
/*Logic-1 > caughtSpeeding
You are driving a little too fast, and a police officer stops you. Write code to compute the result,
encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
caughtSpeeding(60, false) ¡æ 0
caughtSpeeding(65, false) ¡æ 1
caughtSpeeding(65, true) ¡æ 0*/
public class a4_caughtSpeeding {
	public int caughtSpeeding(int speed, boolean isBirthday) {
		  int result=0;
		  if(speed<=65&&isBirthday==true)
		  result=0;
		  else if(speed<=60)
		  result=0;
		  else if(speed>60&&speed<=85&&isBirthday==true)
		  result=1;
		  else if(speed>60&&speed<=80)
		  result=1;
		  else
		  result=2;
		  return result;
		}
	
	// Solution
    public int scaughtSpeeding(int speed, boolean isBirthday) {
        speed = isBirthday ? speed - 5 : speed;
        if (speed > 80) return 2;
        if (speed < 61) return 0;
        return 1;
    }
}
