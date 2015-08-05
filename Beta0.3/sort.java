public class sort{

	public num[] SelectionSort(num[] array){
		int a=0;
		for(int i=0; i<(array.length); i++){
			for(int j=i+1; j<(array.length); j++){
				if(array[j].compareTo(array[i])==-1){
					a = array[j].getvalue();
					array[j].setvalue(array[i].getvalue());
					array[i].setvalue(a);
				}
			}
		}
		return array;
	}

	public int[] InsertionSort (int[] array){
		int numOrdenados=1;
		int indice=0;

			while (numOrdenados<(array.length)){
				int temp=array[numOrdenados];

				for (indice=numOrdenados; indice>0; indice--){

						if(temp<array[indice-1]){
								array[indice]=array[indice-1];
						}else{
								break;
						}

					}
			array[indice]=temp;
			numOrdenados=numOrdenados+1;

			}
		return array;
		}

	public String toString(){
		return "Este programa posee cinco algoritmos de ordenamiento distintos."+
			"Recibe como parámetro un array de int y regresa un array de int ordenado"+
			"de menor a mayor.";
	}
}
