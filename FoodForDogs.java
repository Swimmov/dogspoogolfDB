import java.util.HashMap;
import java.util.Map;

public class FoodForDogs {

    Map<String, String> mapFoodForDogs = new HashMap<String, String> ();

    public Map<String, String> getMapFoodForDogs() {
        mapFoodForDogs.put("1", "Chicken (dry dogs food)");
        mapFoodForDogs.put("2", "Beef (dry dogs food)");
        mapFoodForDogs.put("3", "Salmon (dry dogs food)");
        mapFoodForDogs.put("4", "Cottage Cheese (human food)");
        mapFoodForDogs.put("5", "Chicken & Macaroni (human food)");
        mapFoodForDogs.put("6", "Salmon & Oatmeal (human food)");

        return mapFoodForDogs;
    }

}
