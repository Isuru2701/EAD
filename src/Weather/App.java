package Weather;

class Temp extends Thread {

    //Make an array of 10 temperatures and fill it with random numbers
    double[] temp = {10.0, 20, 10, 31, 20, 23, 10.2};

    double min = temp[0];

    public void run() {
        for (double v : temp) {
            if (v < min) {
                min = v;
            }
        }

        System.out.println("Min temp: " + min);
    }

}

class Rain extends Thread {
    double[] rain = {10.0, 20, 10, 31, 20, 23, 10.2};

    //find max rain
    double max = rain[0];

    public void run() {
        for (double v : rain) {
            if (v > max) {
                max = v;
            }
        }

        System.out.println("Max rain: " + max);
    }

}

public class App {

    public static void main(String[] args) {
        Temp t = new Temp();
        Rain r = new Rain();

        t.setPriority(2);
        t.setName("Temperature");

        r.setPriority(4);
        r.setName("Rain");

        t.start();
        r.start();
    }

}
