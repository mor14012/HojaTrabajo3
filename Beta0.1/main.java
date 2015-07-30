public class main{
	public static void main(String[] args) {
		//Creación de array de 3000 números aleatorios
		int [] array = new int[3000];
		array = new file().generate("datos.txt",3000);
		//Instancia de clase sort que contienen los 5 tipos de ordenamiento
		sort Sort = new sort();
		System.out.println(Sort.toString());

	}
}