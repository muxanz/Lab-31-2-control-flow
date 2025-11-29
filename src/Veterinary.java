import java.util.Scanner;

public class Veterinary {
    public static void classifyPet() {
        Scanner scanner = new Scanner(System.in);
        String needsVaccination;
//        String petDoctor;

        System.out.println("*** Hola Pet-lover 🐶💖!! ***");
        System.out.printf("🐶 ¿Que tipo de mascota tienes? (perro, gato, ave, otro) ");
        String petType = scanner.nextLine().toLowerCase();
        System.out.printf("😺 ¿Cuantos años tiene? ");
        int petAge = scanner.nextInt();

        if ((petType.equals("perro") || petType.equals("gato")) && petAge >= 5) {
            needsVaccination = "Tu peludit@ necesita vacunación adiccional 💉.";
        } else {
            needsVaccination = "No requiere vacunación adicional";
        }

        String petDoctor = switch (petType) {
            case "perro" -> "Veterinario canino 🐶👩🏻‍⚕️";
            case "gato" -> "Veterinario feliino 😺‍👨🏻‍⚕️️";
            case "ave" -> "Veterinario animales exóticos 🐦👩‍⚕️";
            default -> "Veterinario general🧑🏻‍⚕️";
        };

        System.out.println(
                "\nDETALLE DE CONSULTA" +
                "\n--------------------------" +
                "\nTipo mascota => " + petType +
                "\nEdad => " + petAge +
                "\nVacunación adicional => " + needsVaccination +
                "\nSe remite a => " + petDoctor
        );
    }
}
