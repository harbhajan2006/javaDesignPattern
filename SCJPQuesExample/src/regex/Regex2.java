package regex;


/*The \d is looking for digits. The * is a quantifier that looks for 0 to many
occurrences of the pattern that precedes it. Because we specified *, the group() method
returns empty Strings until consecutive digits are found, so the only time group() returns
a value is when it returns 34 when the matcher finds digits starting in position 2. The
start() method returns the starting position of the previous match because, again,
we said find 0 to many occurrences.*/

import java.util.regex.*;
public class Regex2 {
public static void main(String[] args) {
Pattern p = Pattern.compile("\\d*");
Matcher m = p.matcher("ab34ef");
boolean b = false;
while(m.find()) {
System.out.println(m.start() + "--" + m.group());
}
}
}