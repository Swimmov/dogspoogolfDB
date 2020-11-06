import java.util.HashMap;
import java.util.Map;

public class DogsSizeAndBreed {

    Map<Integer, String> mapDogSizeLarge = new HashMap<Integer, String>();
    public Map<Integer, String> getMapDogSizeLarge() {
        mapDogSizeLarge.put(1, "German Shepherd");
        mapDogSizeLarge.put(2, "Golden Labrador");
        mapDogSizeLarge.put(3, "Golden Doodle");
        mapDogSizeLarge.put(4, "Husky");

        return mapDogSizeLarge;
    }

    Map<Integer, String> mapDogSizeMedium = new HashMap<Integer, String>();
    public Map<Integer, String> getMapDogSizeMedium() {
        mapDogSizeMedium.put(1, "Bulldog");
        mapDogSizeMedium.put(2, "Bull Terrier");
        mapDogSizeMedium.put(3, "Chow-Chow");
        mapDogSizeMedium.put(4, "Corgi");

        return mapDogSizeMedium;
    }

    Map<Integer, String> mapDogSizeSmall = new HashMap<Integer, String>();
    public Map<Integer, String > getMapDogSizeSmall () {
        mapDogSizeSmall.put(1, "Jack Russell Terrier");
        mapDogSizeSmall.put(2, "French Bulldog");
        mapDogSizeSmall.put(3, "Boston Terrier");
        mapDogSizeSmall.put(4, "Pug");

        return mapDogSizeSmall;
    }

}
