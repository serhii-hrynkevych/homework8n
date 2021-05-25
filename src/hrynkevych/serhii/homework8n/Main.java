package hrynkevych.serhii.homework8n;

import java.util.Scanner;

public class Main {
    static Admin admin = new Admin();
    static Worker worker = new Worker();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что будем делать?");
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            if (input.equals("Добавить клиента")) {
                addClient();
            }
            if (input.equals("Отобразить клиентов")) {
                admin.outClient();
            }
            if (input.equals("Удалить клиента")) {
                removeClient();
            }
            if (input.equals("Добавить тренеровку")) {
                addTraining();
            }
            if (input.equals("Отобразить клиентов с тренировками")) {
                admin.outClientAndTrain();
            }
        }
    }

    public static void addClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО");
        String inputData = scanner.nextLine();
        if (admin.addClient(inputData) < 0) {
            System.out.println("Не сработало, видимо некорректный ввод");
        } else {
            System.out.println("Новый клиент добавлен");
        }
    }

    public static void removeClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО");
        String inputData = scanner.nextLine();
        if (admin.removeClient(inputData) < 0) {
            System.out.println("Не сработало, видимо некорректный ввод");
        } else {
            System.out.println("Клиент удалён");
        }
    }

    public static void addTraining() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО клиента,ФИО тренера,количество тренеровок");
        String inputData = scanner.nextLine();
        String[] arrayFromClass = inputData.split(",");
        worker.addTraining(arrayFromClass[0], arrayFromClass[1], Integer.parseInt(arrayFromClass[2]));
    }
}
