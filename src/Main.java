import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("Milano", "Genova", "Palermo");


       // cityNames.add(1, "Tegucigalpa");
        cityNames.set(1, "Tegucigalpa");


        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>();

        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println("lista aggiornata:" + Arrays.toString(kingsOfRomeArray));








    }
}