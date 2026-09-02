public class Dragon {
    int x; // kiri dan kanan
    int y; // atas dan bawah
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 0 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid. Arah harus 1 sampai 4.");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y -= steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y += steps;
                break;
            case 4: 
                x -= steps;
                break;
            default:
                System.out.println("Dragon tidak bergerak");
                break;
        }
    }

    public void printStatus() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
        System.out.println("Arah Dragon: " + direction);
    }
}