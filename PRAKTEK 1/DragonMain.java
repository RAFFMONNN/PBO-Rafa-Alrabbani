public class DragonMain {
    public static void main(String[] args) {

        System.out.println("=== Instansiasi Dragon ===");
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("\n== Status awal dragon 1 ==");
        dragon1.printStatus();

        System.out.println("\n=== Dragon 1 bergerak keatas 5 langkah ===");
        dragon1.move(5);
        dragon1.printStatus();

        System.out.println("\n=== Dragon ubah arah ke kanan dan bergerak 3 langkah ===");
        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\n=== Status awal Dragon 2 ===");
        dragon2.printStatus();
    }
}