import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Double Fahrenheit;
        Double Celsius;

        System.out.println("Digite a temperatura em graus Fahrenheit");
        Fahrenheit = sc.nextDouble();

        Celsius = (Farenheit - 32) / 1.8;

        System.out.println(format:"A temperatura em graus Celsius é de: %.2f", Celsius);
        
        sc.close();
       
    }
}