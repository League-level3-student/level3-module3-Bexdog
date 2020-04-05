package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
	
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String end = "";
	s =	s.toLowerCase();
		for(int i = 0; i<s.length();i++) {
			if(i%2==1) {
				end+=s.substring(i,i+1).toUpperCase();
			}
			else {
				end+=s.substring(i, i+1);
			}
		}
		System.out.println(end);
		return end;
	}

}
