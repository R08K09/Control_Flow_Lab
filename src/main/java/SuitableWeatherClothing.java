import java.util.Scanner;

public class SuitableWeatherClothing {
    public static void main(String[] args) {

        // GATHER WEATHER INPUT FROM USER

//        prompt user to input the weather
        System.out.println("What is the weather forecast? (sunny, rainy, windy, snow) ");

//        Collect user input
        Scanner weatherReader = new Scanner(System.in);
        String weatherForecast = weatherReader.nextLine();

//        prompt user to input average temperature
        System.out.println("What is the average temperature for the day? (8 / 18 / 28) ");

//        Collect user input
        Scanner temperatureReader = new Scanner(System.in);
        int averageTemperature = temperatureReader.nextInt();


        // PRINT OUT SUITABLE CLOTHING
        if (weatherForecast.equals("rainy") || weatherForecast.equals("snow")) {
            System.out.println("Wear a waterproof winter jacket.");
        } else if (weatherForecast.equals("sunny") && averageTemperature >= 18) {
            System.out.println("Wear sunglasses and light clothing.");
        } else if (weatherForecast.equals("windy") && averageTemperature < 18) {
            System.out.println("Wear a thick warm jacket.");
        }



    }
}
