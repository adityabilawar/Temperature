public class TemperatureClass {

	 private double ftemp;
	 
	 public TemperatureClass (double fahrenheitGiven)
	 {
		 
		 ftemp = fahrenheitGiven;
	 }
	 
	 public void setFahrenheitGiven(double fahrenheitGiven)
	 {
		 ftemp = fahrenheitGiven;
	 }
	 public double getFahrenheitGiven()
	 {
		 return ftemp;
				 
	 }
	 public double getCelsius()
	 {
		 return ( (double) 5 / 9 ) * ( ftemp - 32 );
	 }
	 public double getKelvin()
	 {
		 return( (5 / (double) 9 ) * ( ftemp - 32) ) + 273;
	 }
	 public TemperatureClass(double fahrenheitGiven) 
	 {
		 ftemp = fahrenheitGiven; 
	 }
}