package hrynkevych.serhii.homework8n;

import java.util.HashMap;
import java.util.HashSet;

public class Clients extends People{
    HashMap<String, Integer> numberTraining= new HashMap<>();

    Clients(String newName) {
        name = newName;
    }
}
