package imc;

public class Imc 
{

	public static void main (String[] args) 
	{
		float peso;
		float altura;
		float imc;
		
		peso = 60;
		altura = 1.70f;
		imc = peso/ (altura * altura);
		
		System.out.print(imc);
	}
	
	
}
