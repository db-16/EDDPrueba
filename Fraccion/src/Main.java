import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Fraccion a,b,c;
		String e;
		int n,d,opcion,
		numero;//Seleccion de la fracción a modificar
		a = new Fraccion();
		b = new Fraccion();

		do {
			System.out.println("----------Calculadora de fracciones---------------");
			opcion = menu();
			switch(opcion) {
			case 1:
				System.out.print("Fraccion 1ª - Numerador: ");
				n= sc.nextInt();
				System.out.print("Fraccion 1ª - Denominador: ");
				d= sc.nextInt();
				a = new Fraccion(n,d);
				System.out.print("Fraccion 2ª - Numerador: ");
				n= sc.nextInt();
				System.out.print("Fraccion 2ª - Denominador: ");
				d= sc.nextInt();
				b = new Fraccion(n,d);
				System.out.println("Fracciones actuales: "+a+" y "+b);
				break;
			case 2: 
				System.out.println("¿Numero de fraccion (1/2)?: ");
				numero = sc.nextInt();
				if(numero==1||numero==2) {
					System.out.println("Fraccion "+numero + "ª - Numerador");
					n = sc.nextInt();
					System.out.println("Fraccion "+numero + "ª - Denominador");
					d = sc.nextInt();
					if(numero==1) {
						a.setNumerador(n);
						a.setDenominador(d);
					}
					else {
						b.setNumerador(n);
						b.setDenominador(d);
					}
				}
				break;

			case 3:
				c=a.Suma(b);
				System.out.print("La suma es: "+c+"\n");
				break;
			case 4:
				c=a.Restar(b);
				System.out.print("La resta es: "+c+"\n");
				break;
			case 5:
				c=a.Producto(b);
				System.out.print("El producto es: "+c+"\n");
				break;
			case 6:
				c=a.Cociente(b);
				System.out.print("El producto es: "+c+"\n");
				break;
			case 7: 
				e= a.FraccionMixta(b);
				System.out.print("La fraccion mista es: "+e);

			case 8:				
				System.out.print("FIN DEL PROGRAMA");

			}
		}while(opcion!=8);
		

	}
	public static int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1 - Introducir fracciones");
			System.out.println("2 - Modificar fracciones");
		System.out.println("3 - Sumar fracciones");
		System.out.println("4 - Restar fracciones");
		System.out.println("5 - Multiplicar fracciones");
		System.out.println("6 - Dividir fracciones");
		System.out.println("7 - Fraccion Mixta");
		System.out.println("8 - Salir");
		System.out.println("Opcion: ");
		opcion = sc.nextInt();
		if(opcion<1 || opcion>8)
			System.out.println("Opcion incorrecta");
			
		}while (opcion<1||opcion>6);
		return opcion;
		
		
	}

}

