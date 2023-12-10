package Interview;

public class StringA1 {
	public static void main(String[] args) {
		  String[] s = {"shbgs20", "jhgd23snh", "xb34ds2"};

	        for (String str : s) {
	            String numbers = extractNumbers(str);
	            System.out.println("Numbers in '" + str + "': " + numbers);
	        }
	    }

	    private static String extractNumbers(String input) {
	        StringBuilder numbers = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            if (Character.isDigit(c)) {
	                numbers.append(c);
	            }
	        }
	        return numbers.toString();
	}
}
