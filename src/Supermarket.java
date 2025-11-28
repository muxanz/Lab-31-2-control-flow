import java.util.Scanner;

public class Supermarket {
    public static void customer() {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT = 0.10;
        double totalDiscount = 0;

        System.out.printf("🙋🏼‍♂️¿Eres miembro del Super (Si/No) => ");
        String isMember = scanner.nextLine().toLowerCase();
        System.out.println(isMember);
        System.out.printf("🤑Ingresa valor total de tu compra => ");
        double totalValue = scanner.nextDouble();
        System.out.printf("🔄️Ingresa la cantidad de productos => ");
        int totalProducts = scanner.nextInt();
        System.out.println(totalValue);
        if (isMember.equals("si")) {
            totalDiscount = totalValue - (totalValue * DISCOUNT);

            if (totalProducts >= 10) {
                totalDiscount = totalDiscount - (totalDiscount * 0.05);

            }
        }
        System.out.println(
                "\n--------------------------" +
                "\n--- EL SUPERMARKET 🛒 ---" +
                "\n--------------------------" +
                "\nCliente preferencial => " + isMember +
                "\nCantidad productos => " +totalProducts +
                "\nSubtotal => " + totalValue +
                "\nTotal a pagar con descuentos 👉🏼 => " + totalDiscount
        );
    }
}
