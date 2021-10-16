package AP_1;
/*AP-1 > scoreUp
The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
the "answers" array contains a student's answers, with "?" representing a question left blank.
The two arrays are not empty and are the same length. Return the score for this array of answers,
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) ¡æ 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) ¡æ 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) ¡æ 16*/
public class b4_scoreUp {
	public int scoreUp(String[] key, String[] answers) {
		  int score=0;
		  for(int i=0; i<key.length; i++){
		    if(key[i].equals(answers[i]))score+=4;
		    else if(answers[i].equals("?"))score+=0;
		    else score-=1;
		  }
		  return score;
		}
	
	// Solution
    public int sscoreUp(String[] key, String[] answers) {
        int out = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) out += 4;
            if (!key[i].equals(answers[i]) && !answers[i].equals("?")) out--;
        }
        return out;
    }
}
