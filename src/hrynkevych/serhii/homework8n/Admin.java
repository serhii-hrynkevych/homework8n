package hrynkevych.serhii.homework8n;

import java.util.HashSet;
import java.util.Set;

public class Admin extends People{
    Set<Clients> clientsSet = new HashSet<>();

    public int addClient(String newName) {
        Clients newClient = new Clients(newName);
        if (clientsSet.add(newClient)) {
            return 0;
        }
        return -1;
    }

    public int removeClient(String newName) {
        for (Clients i : clientsSet) {
            if (i.name.equals(newName)) {
                clientsSet.remove(i);
                return 0;
            }
        }
        return -1;
    }

    public void outClient() {
        for (Clients i : clientsSet)
            System.out.println("Клиент: " + i.name);
    }

    public void outClientAndTrain() {
        for (Clients i : clientsSet)
            System.out.println("Клиент: " + i.name + "Тренировки: " + i.numberTraining);
    }
}
