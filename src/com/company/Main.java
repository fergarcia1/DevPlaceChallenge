package com.company;
import org.w3c.dom.ls.LSInput;
import java.util.Scanner;

//intente aprender como generar un script sql porque nunca aprendi a hacerlo, pero no pude encontrar mucha info sobre como hacer un script ni que es exactamente
// asi que la parte de base de datos me quedo sin hacer, pero ya que hice el resto decidi enviarlo igual!

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0, option2 = 0;
		int i = 0;


		while(option != 92929) {
			System.out.println("1. Algoritmos"); //cada vez que se elige una opcion tarda un buen rato en responder no estoy seguro por que, pero todas las funciones que pude hacer funcionan bien.
			System.out.println("2. Objetos");
			option = scan.nextInt();

			switch (option) {
				case 1:

					System.out.println("1. Ejercicio 1");
					System.out.println("2. Ejercicio 2 y 3");
					System.out.println("3. Ejercicio 4");
					System.out.println("4. Ejercicio 5");
					System.out.println("5. Ejercicio 6");
					option2 = scan.nextInt();

					switch (option2) {
						case 1:
							intervaloPrimos(scan); //llamado funcion Ej1
							break;

						case 2:
							int intArray[] = cincoNumeros(scan); //llamado funcion Ej2
							int arrayOrdenado[] = ordenarArray(intArray); //llamado funcion Ej3

							System.out.println("El algoritmo ordenado es: ");
							for (i = 0; i < 5; i++) { //se sabe que son 5 datos por anticipado asi que se utiliza un for que vaya desde la ultima posicion a la primera para mostrar el orden inverso
								System.out.println(arrayOrdenado[i]);
							}
							break;

						case 3:
							piedraPapelTijera(); //llamado funcion Ej4
							break;

						case 4:
							mostrarSalario(); //llamado funcion Ej5
							break;

						case 5:
							numerosRandom(); //llamado funcion Ej6
							break;
					}
					break;
				case 2:
					Person persona1 = new Person("Juan", "Perez", "10 de abril");
					Person persona2 = new Person();

					System.out.println(persona1.toString());
					System.out.println(persona2.toString());


					boolean igualdad = persona1.compararInstancias(persona2);
					//utilice el metodo equals dentro del metodo compararInstancias para saber si ambos tienen los mismos datos
					System.out.println(igualdad);

					Employee empleado1 = new Employee("Pepe", "Juarez", "12 de mayo","file", "departamento");
					// utilice herencia en la clase employee ya que comparte ciertos datos con la clase persona y
					// solo agrega unos datos nuevos, ademas todo metodo realizado por una persona puede ser realizado por un empleado.
					System.out.println(empleado1.toString());

					break;
			}
		}
	}

	//Ejercicio 1
	public static void intervaloPrimos(Scanner scan) {
		System.out.println("Ejercicio 1");

		int i, f, c; //i: Inicio de intervalo, f: final del mismo, c: contador.

		System.out.println("Inicio del intervalo: ");
		i = scan.nextInt();
		System.out.println("Final del intervalo: ");
		f = scan.nextInt();

		System.out.println("Numeros primos dentro del intervalo: ");
		for (c = i; c <= f; c++) {
			if (primo(c) == true) { // se utiliza un ciclo para recorrer el intervalo, y la funcion "primo" que devuelve un boolean true, si el numero es primo.
				System.out.println(c);
			}
		}
		System.out.println("Numeros no primos dentro del intervalo: ");
		for (c = i; c <= f; c++) {
			if (primo(c) == false) { // lo mismo pero para los numeros no primos.
				System.out.println(c);
			}
		}
	}
	public static boolean primo(int numero) {
		int c = 2;
		boolean primo = true;
		while ((primo) && (c != numero)) {
			if (numero % c == 0)
				primo = false;
			c++;
		}
		return primo;
	}

	//Ejercicio 2
	public static int[] cincoNumeros(Scanner scan) {
		System.out.println("Ejercicio 2");
		int i = 0, aux = 5, suma = 0; //contador para recorrer el arreglo, aux para mejorar el System out un poco y suma para sumar los valores
		int intArray[] = new int[5];

		while (i < 5) {
			System.out.println("Introducir " + aux + " numeros: ");
			intArray[i] = scan.nextInt();
			suma = suma + intArray[i]; //suma los valores en el momento de la carga
			i++;
			aux--;
		}
		System.out.println("La suma de los valores es: " + suma);
		System.out.println("El orden inverso es: ");
		for (i = 4; i >= 0; i--) { //se sabe que son 5 datos por anticipado asi que se utiliza un for que vaya desde la ultima posicion a la primera para mostrar el orden inverso
			System.out.println(intArray[i]);
		}
		return intArray;
	}

	//Ejercicio 3
	public static int[] ordenarArray(int intArray[]) { //se utiliza metodo burbuja de ordenamiento
		System.out.println("Ejercicio 3");


		int aux;
		for(int i = 1; i < intArray.length; i++)
		{
			for(int j = 0; j < intArray.length-i; j++)
			{
				if(intArray[j] > intArray[j+1])
				{
					aux = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = aux;
				}
			}
		}
		System.out.println("Los numeros repetidos son: ");
		for(int i = 0; i < intArray.length-1; i++){ //recorro devuelta el array y cuando se encuentra un numero repetido se muestra por pantalla
			if(intArray[i] == intArray[i+1]){
				System.out.println(intArray[i]);
			}
		}
		return intArray;
	}

	//Ejercicio 4
	public static void piedraPapelTijera(){
		String j1, j2; //jugadores
		Scanner scan = new Scanner(System.in);

		System.out.println("-*-*-Inicio del juego-*-*-");

		System.out.println("Jugador 1 elige (p/a/t): ");
		j1 = scan.nextLine();

		System.out.println("Jugador 2 elige (p/a/t): ");
		j2 = scan.nextLine();

		if(j1.equals("p")){ //probablemente exista una mejor manera de codificar el juego pero no se me ocurrio como, decidi intentar que funcione aunque quede feo el codigo
			if(j2.equals("a")) {
				System.out.println("Jugador 2 gana.");
			}
			if(j2.equals(j1)){
				System.out.println("Empate");
			}
			if(j2.equals("t")){
				System.out.println("Jugador 1 gana.");
			}
		}
		else{
			if(j1.equals("t")){
				if(j2.equals("p")) {
					System.out.println("Jugador 2 gana.");
				}
				if(j2.equals(j1)){
					System.out.println("Empate");
				}
				if(j2.equals("a")){
					System.out.println("Jugador 1 gana.");
				}
			}
			else{
				if(j1.equals("a")){
					if(j2.equals("t")) {
						System.out.println("Jugador 2 gana.");
					}
					if(j2.equals(j1)){
						System.out.println("Empate");
					}
					if(j2.equals("p")){
						System.out.println("Jugador 1 gana.");
					}
				}
			}
		}
	}

	//Ejercicio 5
	public static void mostrarSalario() {
		Scanner scan = new Scanner(System.in);
		double aumento;

		System.out.println("Nombre: ");
		String nombre = scan.nextLine();

		System.out.println("Edad: ");
		int edad = scan.nextInt();

		System.out.println("Salario: ");
		double salario = scan.nextFloat();

		if(edad < 16){
			System.out.println("No posee salario ya que es menor de edad.");
		}
		if(edad == 17 || edad == 18){
			System.out.println("El salario es: " + salario);
		}
		if(edad >= 19 && edad <= 50){
			aumento = salario * 0.05;
			salario= salario + aumento;
			System.out.println("El salario es: " + salario);
		}
		if(edad >= 51 && edad <= 60){
			aumento = salario * 0.10;
			salario= salario + aumento;
			System.out.println("El salario es: " + salario);
		}
		if(edad > 60){
			aumento = salario * 0.15;
			salario= salario + aumento;
			System.out.println("El salario es: " + salario);
		}
	}

	//Ejercicio 6

	public static void numerosRandom(){
		Scanner scan = new Scanner(System.in);

		int n1 = (int)(Math.random()*1000+0),n2 = (int)(Math.random()*1000+0),n3 = (int)(Math.random()*1000+0),i=0;   //3 numeros random y un contador
		String control; //lo utilizo para que asignarle el valor del scanner, asi el usuario tiene que presionar una tecla para continuar

		while(i < 1000){ // no me se ocurrio otra manera de hacer el ciclo while asi que me parecio buena idea reutilizar el contador i
			i++;
			System.out.println(n1+ " " + n2 + " "  + n3);
			if(n1 % 2 == 0){
				if(n2 % 2 == 0){
					if(n3 % 2 == 0){
						System.out.println("No se consiguio par, par, impar");
						System.out.println("Presione una tecla para continuar");
						control = scan.nextLine();
					}
					else{
						System.out.println("Se consiguio par, par, impar");
						break;
					}
				}
				else{
					System.out.println("No se consiguio par, par, impar");
					System.out.println("Presione una tecla para continuar");
					control = scan.nextLine();
				}
			}
			else {
				System.out.println("No se consiguio par, par, impar");
				System.out.println("Presione una tecla para continuar");
				control = scan.nextLine();
			}
			n1 = (int)(Math.random()*1000+0);
			n2 = (int)(Math.random()*1000+0);
			n3 = (int)(Math.random()*1000+0);
		}
		System.out.println("Cantidad de intentos hasta par par impar: " + i);
	}

}



