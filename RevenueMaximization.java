import java.util.Scanner;

class Garage {
    int bikes;
    int cars;
    int trucks;

    public Garage(int bikes, int cars, int trucks) {
        this.bikes = bikes;
        this.cars = cars;
        this.trucks = trucks;
    }
}

public class RevenueMaximization {

    public static int calculateRevenue(Garage garage) {
        return (garage.bikes * 100) + (garage.cars * 250) + (garage.trucks * 500);
    }

    public static int maximizeRevenue(Garage[] garages, int n) {
        int maxRevenue = 0;

        for (int i = 0; i < n; i++) {
            int revenue = calculateRevenue(garages[i]);
            maxRevenue = Math.max(maxRevenue, revenue);
        }

        return maxRevenue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of garages: ");
        int n = scanner.nextInt();

        Garage[] garages = new Garage[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Garage " + (i + 1) + ":");
            System.out.print("Number of bikes: ");
            int bikes = scanner.nextInt();

            System.out.print("Number of cars: ");
            int cars = scanner.nextInt();

            System.out.print("Number of trucks: ");
            int trucks = scanner.nextInt();

            garages[i] = new Garage(bikes, cars, trucks);
        }

        int result = maximizeRevenue(garages, n);
        System.out.println("Maximum revenue: " + result);

        scanner.close();
    }
}
