package Logic_1;
/*Logic-1 > answerCell
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.
answerCell(false, false, false) ¡æ true
answerCell(false, false, true) ¡æ false
answerCell(true, false, false) ¡æ false*/
public class b6_answerCell {
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  // return isAsleep==true?false:true;
		  if(!isAsleep&&!isMorning)
		  return true;
		  if(!isAsleep&&!isMom)
		  return true;
		  return false;
		}

	// Solution
    public boolean sanswerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep && !isMorning) return true;
        if (!isAsleep && isMom) return true;
        return false;
    }
}
