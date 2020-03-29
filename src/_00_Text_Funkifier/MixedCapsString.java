package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		s=s.toLowerCase();
		s.substring(0, 0).toUpperCase();
		return s;
	}

}
