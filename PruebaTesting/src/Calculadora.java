
public class Calculadora {

	private int valor=0;

	public int valor(){
		return 1;
	}
	
	
	public int sumar(int a,int b){
		int resultado= a+b;
		if(resultado==5){
			System.out.println("suma correcta");
		}else{
			System.out.println("suma incorrecta");
		}
		return resultado;
	}// fin metodo
	
	
	public int multiplicacion(int c,int d){
		int resu= c*d;
			if(resu==18){
				System.out.println("multiplicacion esperada");
			}else{
				System.out.println("multiplicaciones no es 18!!!");
			}
			return resu;
	}// fin metodo
	
	
	
	
}
