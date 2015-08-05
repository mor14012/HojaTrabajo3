import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		int numero=0;

		System.out.println("Bienvenido\nIngrese el número de digitos que desea generar y ordenar: ");
		while(true){
			try{
				Scanner input = new Scanner(System.in);
				numero = input.nextInt();
				break;
			}
			catch(Exception e){
				System.out.println("Error: Por favor, ingrese un número válido.");
			}
		}
		String resultado="";
		//Creación de array de un número específico de números aleatorios
		int [] arrayrandom = new int[numero];
		num [] array = new num[numero];
		//Se llama al método generate de la clase File para generar el txt con números
		arrayrandom = new file().generate("datos.txt",numero);
		//Se asignan los valores aleatorios a el array de la clase que implementa Comparable
		for(int i=0; i<array.length; i++){
			array[i] = new num();
			array[i].setvalue(arrayrandom[i]);
		}
		System.out.println("------ Input Array -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);

		//Instancia de clase sort que contienen los 5 tipos de ordenamiento
		sort Sort = new sort();

		//Selection Sort
		array = Sort.SelectionSort(array);
		resultado="";
		System.out.println("----- SelectionSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);
/*
        //Insertion Sort
		array = Sort.InsertionSort(array);
		resultado="";
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);
*/
		/*Utilicen este template para imprimir sus resultados
		Cambien Template por el nombre de su Sort

		//Template Sort
		array = Sort.TemplateSort(array);
		resultado="";
		System.out.println("----- TemplateSort -----");
		for(int i=0; i<array.length; i++){
			resultado+=array[i].getvalue();
		}
		System.out.println(resultado);
	*/
	}
}
