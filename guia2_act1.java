public class guia2_act1{
	public static void main(String[] args){
		Dupla primerPar;
		
		primerPar = new Dupla(12, 32);
		
		System.out.println(primerPar);
	}
}


class Dupla{
	
	private int a;
	private int b;
	
	public Dupla(){
	}
	
	public Dupla(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int getA(){
		return a;
	}
	
	public void setA(int a){
		this.a = a;
	}
	
	public int getB(){
		return b;
	}
	
	public void setB(int b){
		this.b = b;
	}
	
	public void guardar(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public String toString(){
		return String.format("(%d, %d)", a, b);
	}
}

