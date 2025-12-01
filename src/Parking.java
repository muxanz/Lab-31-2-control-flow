import java.util.Scanner;

public class Parking {
    public static void access() {
        Scanner scanner = new Scanner(System.in);
        final int CAR = 5000;
        final int MOTORCYCLE = 3000;
        final int BIKE = 1000;
        String vehicleType;
        int timeEntry;
        int rate = 0;

        System.out.println("\n🏁🏁Vallet Parking🏁🏁");
        System.out.printf("Ingresa tipo de Vehículo (auto, moto, bicicleta) => ");
        vehicleType = scanner.nextLine().toLowerCase();
        System.out.printf("Hora de ingreso (24H) => ");
        timeEntry = scanner.nextInt();

        switch (vehicleType) {
            case "auto":
                if (timeEntry >= 20) {
                    rate = (int) ((CAR * 0.2) + CAR);
                } else {
                    rate = CAR;
                }
                break;
            case "moto":
                if (timeEntry >= 20) {
                    rate = (int) ((MOTORCYCLE * 0.2) + MOTORCYCLE);
                } else {
                    rate = MOTORCYCLE;
                }
                break;
            case "bicicleta":
                if (timeEntry >= 20) {
                    rate = (int) ((BIKE * 0.2) + BIKE);
                } else {
                    rate = BIKE;
                }
                break;
            default:
                rate = 0;
        }

        System.out.println(
            "\n__________________________" +
            "\n--- RECIBO DE SERVICIO ---" +
            "\n---------🚗🏍️🚲----------" +
            "\n=> Tipo de vihículo: " + vehicleType +
            "\n=> Hora de ingreso: " + timeEntry +
            "\n=> Total a pagar: $" + rate
        );


    }
}
