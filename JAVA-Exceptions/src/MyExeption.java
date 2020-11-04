import java.util.Arrays;
import java.util.List;

public class MyExeption extends Exception{
	
	public static final int ERROR_0 = 0;
	public static final int ERROR_1 = 1;
	public static final int ERROR_2 = 2;
	
	private int value;
	
	public MyExeption (int value) {
		this.value = value;
	}
	
	private List<String> message = Arrays.asList(
				"Este es mi error 0",
				"Este es mi error 1",
				"Este es mi error 2"
			);
			
	
	@Override
	public String getMessage() {
		return message.get(value);
	}
}
