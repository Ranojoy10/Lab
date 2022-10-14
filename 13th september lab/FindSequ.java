package Lab;

public class FindSequ {

	public static String validate(String input) {
		if (input.matches("[a-z]+_[A-Z]+)")) {
                return "Match Found";
		}
		else {
			return "Match Not Found";
		}
	}
	public static void main(String... args) {
		System.out.println(validate("ranojoy_banerjee"));
		System.out.println(validate("RANOJOY_BANERJEE"));
		System.out.println(validate("Ranojoy_Banerjee"));
	}
}
