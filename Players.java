public class Players {
    String Name;
    String DogBreed;
    String DogForWater;
    String DogFoodMorning;
    String DogFoodEvening;

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setDogBreed(String DogBreed) {
        this.DogBreed = DogBreed;
    }
    public String getDogBreed() {
        return DogBreed;
    }

    public void setDogForWater (String DogForWater) {
        if (DogForWater.equals("1")) {
            this.DogForWater = "Yes";
        }
        if (DogForWater.equals("2")) {
            this.DogForWater = "No";
        }

    }
    public String getDogForWater () {
        return DogForWater;
    }

}

