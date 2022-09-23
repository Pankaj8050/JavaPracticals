package java8features;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		
		String str[] = new String[10];
		
		Optional <String> optional = Optional.ofNullable(str[5]);
		if (optional.isPresent()){
			String uppercase = str[5].toUpperCase();
			System.out.println(uppercase);
			
		}
		else {
			System.out.println("Value not present at 5th position");
			
		}
	}

}
