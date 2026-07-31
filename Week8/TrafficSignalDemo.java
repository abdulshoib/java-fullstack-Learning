enum TrafficSignal {
    RED, YELLOW, GREEN
}

public class TrafficSignalDemo {

    public static void main(String[] args) {

        TrafficSignal signal = TrafficSignal.GREEN;

        switch (signal) {

            case RED:
                System.out.println("Stop");
                break;

            case YELLOW:
                System.out.println("Ready");
                break;

            case GREEN:
                System.out.println("Go");
                break;
        }
    }
}