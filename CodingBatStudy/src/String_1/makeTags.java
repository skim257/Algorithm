package String_1;
/*
 * 
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") ¡æ "<i>Yay</i>"
makeTags("i", "Hello") ¡æ "<i>Hello</i>"
makeTags("cite", "Yay") ¡æ "<cite>Yay</cite>"
 */
public class makeTags {
	public String makeTags1(String tag, String word) {
		  return "<"+tag+">"+word+"</"+tag+">";
	}
	
	// Solution
    public String makeTags2(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
