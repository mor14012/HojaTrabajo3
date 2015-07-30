public class main{
	public static void main(String[] args) {
		file archivo = new file();
		String input=archivo.generate("datos.txt",3000);
		System.out.println(input);
	}
}