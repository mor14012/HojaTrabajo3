public class main{
	public static void main(String[] args) {
		file File = new file();
		String input=File.generate("datos.txt",3000);
		System.out.println(input);
	}
}