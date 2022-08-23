public class Main {
    public static void main(String[] args) {
        int t = 0;
        int smallest = 0;
        int time = 0;

        while (t <= 100) {
            int value = (t * (t - 20) * (t - 100) + 120000);
            int value2 = ((t - 1) * (t - 21) * (t - 101) + 120000);
            int value3 = value - value2;
            if (value3 < smallest) {
                smallest = value3;
                time = t;
            }
            t = t + 1;
        }

        System.out.println(time);
    }
}