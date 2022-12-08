

public class Random {

    boolean a;
    double b;
    int c;



    public static boolean nextBoolean(boolean a) {


    double l = Math.random();

        if (l >= 0.5) {

            return true;

        } else {
            return false;
        }


    }

    public static double nextDouble(double b) {


        double s;

        do {
            s = Math.random() * 10;


        } while (s > 0 && s < Math.abs(s));

        return s;

    }


    public static int nextInteger(int c) {

    int t;
    double d;

    do {
        d = Math.random() * 10;

    } while (d > 0 && d < Math.abs(c));


    }




}















