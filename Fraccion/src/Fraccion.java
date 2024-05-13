
public class Fraccion {
	private int numerador;
	private int denominador;
	private double valor;
	private boolean valorEsRepresentativo;
	public Fraccion(){
		this.numerador=0;
		this.denominador=1;
		this.valor=0.0;
		this.valorEsRepresentativo= true;

	}
	public Fraccion(int n, int d) {
		this.numerador=n;
		this.denominador=d;
		if(denominador==0) {
			this.valorEsRepresentativo= false;
		}
		else {
			this.valor =(double) n/d;
			this.valorEsRepresentativo=true;
		}
	}
	public Fraccion Suma(Fraccion f)
	{
		Fraccion s= new Fraccion();
		s.numerador = this.numerador*f.denominador+f.numerador*this.denominador;
		s.denominador=this.denominador *f.denominador;
		s.simplificar();
		return s;
	}
	public String toString() {
		String resultado;
		if (valorEsRepresentativo == true) {
			 resultado = this.numerador+"/"+this.denominador;
		}
		else {
			 resultado = this.numerador+"/"+this.denominador+"("+(this.numerador/this.denominador)+")";
			
		}
		return resultado;
	}
	private void simplificar() {
		int divisorComun;
		if(this.denominador!=0) {
			divisorComun = mcd(this.numerador,this.denominador);
			this.numerador = this.numerador/divisorComun;
			this.denominador = this.denominador/divisorComun;
			calcularValor();
		}
		
	}
	private void calcularValor() {
		if(denominador==0) {
			this.valorEsRepresentativo= false;
		}
		else {
			this.valor =(double) numerador/denominador;
			this.valorEsRepresentativo=true;
			}
	}
	  public static int mcd(int num1, int num2) {
		  
	        int a = Math.max(num1, num2);
	        int b = Math.min(num1, num2);
	 
	        int resultado = 0;
	        do {
	            resultado = b;
	            b = a % b;
	            a = resultado;
	        } while (b != 0);
	 
	        return resultado;
	    }
	  public Fraccion Restar(Fraccion f) {
		    Fraccion s= new Fraccion();
			s.numerador = this.numerador*f.denominador-f.numerador*this.denominador;
			s.denominador=this.denominador *f.denominador;
			s.simplificar();
			return s;
		  
	  }
	  public Fraccion Producto(Fraccion f) {
		    Fraccion s= new Fraccion();
			s.numerador = this.numerador*f.numerador;
			s.denominador=this.denominador *f.denominador;
			s.simplificar();
			return s;
	  }
	  public Fraccion Cociente(Fraccion f) {
		    Fraccion s= new Fraccion();
			s.numerador = this.numerador*f.denominador;
			s.denominador=this.denominador *f.denominador;
			s.simplificar();
			return s;
	  }
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
		calcularValor();
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
		calcularValor();
	}
	
	public String FraccionMixta(Fraccion f){
	       String res="";
	       if(f.getDenominador()>=f.getNumerador())
	           res="Es una fracción propia";
	       else{
	            int numerador = f.getNumerador();
	            int denominador = f.getDenominador();
	            int resultado = numerador / denominador;
	            int resto = numerador % denominador;
	            res = resultado+" "+resto+"/"+denominador;
	       }
	   return res;
	}

		
	
}
