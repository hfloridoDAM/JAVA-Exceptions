
public class main {

	public static void main(String[] args) throws MyExeption {
		try {
			raiseError0();
		} catch (MyExeption e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Esto es el finally 1");
		}
		
		try {
			raiseError1();
			raiseError2();
		} catch (MyExeption e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Esto es el finally 2");
		}
		
		try {
			raiseError0();
			raiseError2();
		} catch (MyExeption e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Esto es el finally 2");
		}
		
	}
	
	private static void raiseError0() throws MyExeption {
		throw new MyExeption(MyExeption.ERROR_0);
	}
	
	private static void raiseError1() throws MyExeption {
		throw new MyExeption(MyExeption.ERROR_1);
	}
	
	private static void raiseError2() throws MyExeption {
		throw new MyExeption(MyExeption.ERROR_2);
	}
}
