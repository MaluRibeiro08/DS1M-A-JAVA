package retangulo;

public class Retangulo 
{

	public static void main (String[] args) 
	{
		float base;
		float altura;
		float perimetro;
		float area;
		
		base = 40;
		altura = 4;
		perimetro = (2*base)+(2*altura);
		area = base*altura;
		
		System.out.print("Perímetro do retângulo: ");
		System.out.println(perimetro);
		
		System.out.print("Área do retângulo: ");
		System.out.println(area);
	}
	
}
