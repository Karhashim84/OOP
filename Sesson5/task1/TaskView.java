package Sesson5.task1;

import java.util.List;
import java.util.Scanner;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public String getUserInput() {
        System.out.print("Введите новую задачу: ");
        return scanner.nextLine();
    }

    public int getTaskIndexToRemove() {
        System.out.print("Введите номер задачи для удаления: ");
        return scanner.nextInt() - 1;
    }
}