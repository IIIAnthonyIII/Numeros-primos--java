public class Criba{
	/*
	Generar numeros primos de  a max
	@param max es el valor maximo
	@return Vector de numeros primos
	*/
	public static int [] generarPrimos (int max){
		int i,j;
		if (max >= 2){
			//Declaraciones
			int dim =max+1; //Tamaño del array
			boolean[] esPrimo = new boolean[dim];
			//Inicializar el array
			for (i=0; i<dim; i++)
				esPrimo[i] = true;
			//Eliminar el 0 y el , que no son primos
			esPrimo[0] = esPrimo[1] = false;
			//Criba
			for (i=2; i<Math.sqrt(dim)+1; i++){
				if(esPrimo[i]){
					//Eliminar los multiplos de i
					for (j=2*i; j<dim;j+=1)
						esPrimo[j] = false;
			}
		}
		//¿Cuantos primos hay?
		int cuenta = 0;
		for (i=0; i<dim; i++){
			if (esPrimo[i])
				cuenta++;
		}
		//Rellenar el vector de numeros primos
		int[] primos = new int [cuenta];
		for (i=0, j=0; i<dim; i++){
			if (esPrimo[i])
				primos[j++] = i;
		}
		return primos;
		}else{ //max < 2
		return new int [0]; //Vector vacio
		}
	}
}