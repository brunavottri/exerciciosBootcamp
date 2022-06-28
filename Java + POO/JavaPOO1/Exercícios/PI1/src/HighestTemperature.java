public class HighestTemperature {
    public static void main(String[] args) {
        String cities[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperatures[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int highestTemperature = Integer.MIN_VALUE;
        int highestPosition = 0;
        int lowestTemperature = Integer.MAX_VALUE;
        int lowestPosition = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i][0] > highestTemperature) {
                highestTemperature = temperatures[i][1];
                highestPosition = i;
            }
            if (temperatures[i][0] < lowestTemperature) {
                lowestTemperature = temperatures[i][0];
                lowestPosition = i;
            }
        }

        System.out.println("A temperatura mais baixa foi em: " + cities[lowestPosition] + ", " + lowestTemperature + " graus");
        System.out.println("A temperatura mais alta foi em: " + cities[highestPosition] + ", " + highestTemperature + " graus");
    }
}
