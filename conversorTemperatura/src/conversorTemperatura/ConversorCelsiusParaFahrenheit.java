package conversorTemperatura;

public class ConversorCelsiusParaFahrenheit 
{

	public static void main (String[] args) 
	{
		//declara��o das vari�veis
		float tempCelsius;
		float tempFahrenheit;
		
		//atribui��o de valores
		tempCelsius = 28;
		
		//processamento pelo qual os dados passar�o
		
		tempFahrenheit = ((9*tempCelsius)+160)/5;
		
		//Pedido de impress�o
			//imprime a frase "__�C correspode a __� na escala de Faran
		System.out.print(tempCelsius + "�C corresponde a " + tempFahrenheit + "� na escala Fahrenheit");
		
	}

}
