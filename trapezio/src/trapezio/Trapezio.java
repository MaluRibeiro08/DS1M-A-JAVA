package trapezio;

public class Trapezio 
{

	public static void main (String[] args) 
	{
		//declara��o das vari�veis
		float baseMa;
		float baseMe;
		float altura;
		float area;
		
		//atribui��o de valores
		baseMa = 8;
		baseMe = 4;
		altura = 6;
		
		//processamento pelo qual os dados passar�o
		area = ((baseMa+baseMe)*altura)/2;
		
		//Pedido de impress�o
		System.out.print("�rea do trap�zio: ");
		System.out.print(area);
	}
}