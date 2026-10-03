import java.util.Scanner;

public class Mainconverter {

    // Currency Converter
    static class Currency {
        final double DOLLAR = 83.50;
        final double EURO = 90.20;
        final double YEN = 0.55;

        double dollarToINR(double d) {
            return d * DOLLAR;
        }

        double inrToDollar(double i) {
            return i / DOLLAR;
        }

        double euroToINR(double e) {
            return e * EURO;
        }

        double inrToEuro(double i) {
            return i / EURO;
        }

        double yenToINR(double y) {
            return y * YEN;
        }

        double inrToYen(double i) {
            return i / YEN;
        }
    }

    // Distance Converter
    static class Distance {

        double meterToKM(double m) {
            return m / 1000;
        }

        double kmToMeter(double k) {
            return k * 1000;
        }

        double milesToKM(double mi) {
            return mi * 1.60934;
        }

        double kmToMiles(double k) {
            return k / 1.60934;
        }
    }

    // Time Converter
    static class Time {

        double hoursToMinutes(double h) {
            return h * 60;
        }

        double hoursToSeconds(double h) {
            return h * 3600;
        }

        double minutesToHours(double m) {
            return m / 60;
        }

        double secondsToHours(double s) {
            return s / 3600;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Currency c = new Currency();
        Distance d = new Distance();
        Time t = new Time();

        System.out.println("========== CONVERTER APPLICATION ==========");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\n1. Dollar -> INR");
                System.out.println("2. INR -> Dollar");
                System.out.println("3. Euro -> INR");
                System.out.println("4. INR -> Euro");
                System.out.println("5. Yen -> INR");
                System.out.println("6. INR -> Yen");

                System.out.print("Enter choice: ");
                int ch1 = sc.nextInt();

                System.out.print("Enter amount: ");
                double a1 = sc.nextDouble();

                if (ch1 == 1)
                    System.out.printf("%.2f Dollar = %.2f INR",
                            a1, c.dollarToINR(a1));

                else if (ch1 == 2)
                    System.out.printf("%.2f INR = %.2f Dollar",
                            a1, c.inrToDollar(a1));

                else if (ch1 == 3)
                    System.out.printf("%.2f Euro = %.2f INR",
                            a1, c.euroToINR(a1));

                else if (ch1 == 4)
                    System.out.printf("%.2f INR = %.2f Euro",
                            a1, c.inrToEuro(a1));

                else if (ch1 == 5)
                    System.out.printf("%.2f Yen = %.2f INR",
                            a1, c.yenToINR(a1));

                else if (ch1 == 6)
                    System.out.printf("%.2f INR = %.2f Yen",
                            a1, c.inrToYen(a1));

                else
                    System.out.println("Invalid Choice");

                break;

            case 2:
                System.out.println("\n1. Meter -> KM");
                System.out.println("2. KM -> Meter");
                System.out.println("3. Miles -> KM");
                System.out.println("4. KM -> Miles");

                System.out.print("Enter choice: ");
                int ch2 = sc.nextInt();

                System.out.print("Enter value: ");
                double a2 = sc.nextDouble();

                if (ch2 == 1)
                    System.out.printf("%.2f Meter = %.2f KM",
                            a2, d.meterToKM(a2));

                else if (ch2 == 2)
                    System.out.printf("%.2f KM = %.2f Meter",
                            a2, d.kmToMeter(a2));

                else if (ch2 == 3)
                    System.out.printf("%.2f Miles = %.2f KM",
                            a2, d.milesToKM(a2));

                else if (ch2 == 4)
                    System.out.printf("%.2f KM = %.2f Miles",
                            a2, d.kmToMiles(a2));

                else
                    System.out.println("Invalid Choice");

                break;

            case 3:
                System.out.println("\n1. Hours -> Minutes");
                System.out.println("2. Hours -> Seconds");
                System.out.println("3. Minutes -> Hours");
                System.out.println("4. Seconds -> Hours");

                System.out.print("Enter choice: ");
                int ch3 = sc.nextInt();

                System.out.print("Enter value: ");
                double a3 = sc.nextDouble();

                if (ch3 == 1)
                    System.out.printf("%.2f Hours = %.2f Minutes",
                            a3, t.hoursToMinutes(a3));

                else if (ch3 == 2)
                    System.out.printf("%.2f Hours = %.2f Seconds",
                            a3, t.hoursToSeconds(a3));

                else if (ch3 == 3)
                    System.out.printf("%.2f Minutes = %.2f Hours",
                            a3, t.minutesToHours(a3));

                else if (ch3 == 4)
                    System.out.printf("%.2f Seconds = %.2f Hours",
                            a3, t.secondsToHours(a3));

                else
                    System.out.println("Invalid Choice");

                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}