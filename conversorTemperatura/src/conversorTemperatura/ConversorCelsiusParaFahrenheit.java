package conversorTemperatura;

public class ConversorCelsiusParaFahrenheit 
{

	public static void main (String[] args) 
	{
		//declaração das variáveis
		float tempCelsius;
		float tempFahrenheit;
		
		//atribuição de valores
		tempCelsius = 28;
		
		//processamento pelo qual os dados passarão
		
		tempFahrenheit = ((9*tempCelsius)+160)/5;
		
		//Pedido de impressão
			//imprime a frase "__ºC correspode a __º na escala de Faran
		System.out.print(tempCelsius + "°C corresponde a " + tempFahrenheit + "° na escala Fahrenheit");
		
	}

}
