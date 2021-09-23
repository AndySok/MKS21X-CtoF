/*
1. The two functions that I need to create should probably have 
one paramater each: Either degrees in Fahrenhneit or Celsius.

2. Both parameters should be doubles, as the conversion can output a mixed number.

3. When invoked, the two functions return the degrees given 
converted to the other system of measurement.  
*/
public class CtoFTester{
    public static void main(String[] args){
        System.out.println("celsiusToFahrenheit invocation... input: 12.0, should return 53.6");        
        System.out.println(celsiusToFahrenheit(12.0));
        System.out.println("fahrenheitToCelsius invocation... input: 24.4, should return -4.222...");        
        System.out.println(fahrenheitToCelsius(24.4));
    }
    public static double celsiusToFahrenheit(double celsius){ //converts celsius to fahrenheit using the formula Fahrenheit = Celsius * (9.0 / 5.0) + 32.0;
        return celsius*(9.0 / 5.0)+32.0;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32)*5/9;
    }
}