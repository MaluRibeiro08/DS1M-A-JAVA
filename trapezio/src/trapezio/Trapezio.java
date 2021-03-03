package trapezio;

public class Trapezio 
{

	public static void main (String[] args) 
	{
		//declaração das variáveis
		float baseMa;
		float baseMe;
		float altura;
		float area;
		
		//atribuição de valores
		baseMa = 8;
		baseMe = 4;
		altura = 6;
		
		//processamento pelo qual os dados passarão
		area = ((baseMa+baseMe)*altura)/2;
		
		//Pedido de impressão
		System.out.print("Área do trapézio: ");
		System.out.print(area);
	}
}