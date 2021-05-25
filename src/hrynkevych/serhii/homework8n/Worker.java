package hrynkevych.serhii.homework8n;

import java.util.HashMap;

public class Worker {


    public void addTraining(String nameClient, String nameTrainer, int numberTraining) {
        Admin admin = new Admin();
        for (Clients c: admin.clientsSet) {
            if (c.name.equals(nameClient)) {
                c.numberTraining.put(nameTrainer, numberTraining);
            }
        }
    }
}
