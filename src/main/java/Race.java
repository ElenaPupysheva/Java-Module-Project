public class Race {
    static String winnerName = "";
    static int hours = 24;
    static int distance = 0;

    public static String getWinner(String name, int speed) {
        int newDistance = speed * hours;
        if (distance < newDistance) {
            distance = speed * hours;
            winnerName = name;
        }

        return winnerName;
    }
}
