import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        System.out.println("Добро пожаловать на гонку 24 часа Ле-Мана! Давайте зарегестрируем 3 участников!");
        ArrayList<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<4;i++){
            System.out.println("Введите марку машины №:"+i);
            String name = scanner.next();
            System.out.println("Введите скорость машины:"+i);
            int speed;
            while (true) {
                speed = scanner.nextInt();
                if ((speed > 0) && (speed <= 250)) {
                    break;
                } else {
                    System.out.println("Неправильная скорость");
                    System.out.println("Введите скорость машины:" + i);
                }

            }
            carList.add(new Car(name,speed));
            Race.getWinner(name,speed);

        }
        System.out.println("Гонка завершена!");
        for (Car car : carList) System.out.println("В гонке участвовали: "+car.name+" со скоростью " +car.speed+ " км/ч");
        System.out.println("Ура победителю гонки Ле-Мана "+Race.winnerName);
        }
}
