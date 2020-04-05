package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String end = "";
		s = s.toLowerCase();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				end+="A";
			}
			else if(s.charAt(i)=='e') {
				end+="E";
			}
			else if(s.charAt(i)=='i') {
				end+="I";
			}
			else if(s.charAt(i)=='o') {
				end+="O";
			}
			else if(s.charAt(i)=='u') {
				end+="U";
			}
			else {
			end+=s.charAt(i);
			}
		}
		System.out.println(end);
		return end;
	}

}
