import java.util.Scanner;

public class TemperatureClassTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double userFahrenheitTemperature;
		
        System.out.println( "Please enter a fahrenheit Temperature" );
        userFahrenheitTemperature = scan.nextDouble();
        
        TemperatureClass temp1 = new TemperatureClass( userFahrenheitTemperature );
        
        System.out.printf( "Fahrenheit temperature: %.2f\nCelsius temperature: %.2f\nKelvin temperature: %.2f " , 
        		temp1.getFahrenheitGiven(), temp1.getCelsius(), temp1.getKelvin() );
         
           // int number
	}

}