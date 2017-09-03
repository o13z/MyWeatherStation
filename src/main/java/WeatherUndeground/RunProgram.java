package WeatherUndeground;

import java.util.Scanner;

public class RunProgram {
    private static String location;


    public static void main(String[] args) {
        askForChoise();
    }

    private static void askForChoise() {
        Scanner reader = new Scanner(System.in);
        System.out.println("1. Get local weather ");
        System.out.println("2. chisinau airport ");
        System.out.println("3. Enter location: ");
        int n = reader.nextInt();

        switch (n) {
            case 1 : location = "autoip.json";
                break;
            case 2 : location = "LUKK.json";
                break;
            case 3 : userInputLocation();
        }

        GetWeather getWeather = new GetWeather();
        getWeather.getCurrentWeather(location);
    }

    private static void userInputLocation() {
        System.out.println("Enter Location: ");
        Scanner scanner = new Scanner(System.in);
        location = scanner.nextLine() + ".json";
    }


}
