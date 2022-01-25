public class Week2q3 {
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis/1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours % 24;
        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
