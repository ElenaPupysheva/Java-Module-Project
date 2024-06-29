import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на гонку 24 часа Ле-Мана! Давайте зарегестрируем 3 участников!");
        ArrayList<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите марку машины №:" + i);
            String name = scanner.nextLine();
            int speed;
            System.out.println("Введите скорость машины:" + i);
            while (true) {
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    int max = 250;
                    int min = 0;
                    if ((speed > min) && (speed <= max)) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость, попробуйте снова");
                    }
                } else {
                    System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                    scanner.nextLine();

                }
            }
            carList.add(new Car(name, speed));
            Race.getWinner(name, speed);
        }
        System.out.println("Гонка завершена!");
        for (Car car : carList) {
            System.out.println("В гонке участвовал: " + car.name + " со скоростью " + car.speed + " км/ч");
        }

        System.out.println("Ура победителю гонки Ле-Мана " + Race.winnerName);
    }
}