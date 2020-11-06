import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Random;

public class DogsPooGolf {
   static float canDistance = new Random().nextFloat() * 10.25f + 65.75f;
   static float delta = 0.5f;
    public static void main(String[] args) throws IOException {
        Players player1 = new Players();
        Players player2 = new Players();
        CpuPlayer cpuPlayer = new CpuPlayer();
        FoodForDogs dogFood = new FoodForDogs();
        DogsSizeAndBreed dogBreed = new DogsSizeAndBreed();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPlayers;
        String playerDogSize;

        //start GAME:
        System.out.println("\t\t Welcome to our Competition");
        System.out.println("||---------------------------------------------------------||");
        System.out.println("Number of players?  1. One   2. Two ?");
//exceptionForm for numOfPlayers;
        numberOfPlayers =  exceptionForm(bufferedReader.readLine(),2); // int

//-------------------------------------------  ONE PLAYER against CPU ------------------------------------------------//
        if (numberOfPlayers == 1) {
            System.out.println("Let Start. One player against CPU. \t What is your name?");
            player1.setName(bufferedReader.readLine());    // player's name
            // choose the size
            System.out.println("\n\t Ok, " + player1.getName() + ", please, choose the size of your dog:");
            System.out.println("\t1. Large size, \n\t2. Medium size, \n\t3. Small size");
            System.out.println("---||-----------------------------------------------------||");
// exceptionForm for playerDogSize (String)
            playerDogSize =  String.valueOf(exceptionForm(bufferedReader.readLine(),3));
            //set up distance to the trash can 
            if (playerDogSize.equals("2")) { canDistance =  canDistance * 0.75f;}
            if (playerDogSize.equals("3")) { canDistance =  canDistance * 0.5f;}
            // choose the breed (String)
            player1.setDogBreed(printAndSetTheBreed(playerDogSize, dogBreed));
            // choose the food and water
            player1.DogFoodMorning = FoodForMorning();  //number (String)
            player1.DogFoodEvening = FoodForEvening();  //number (String)
            player1.setDogForWater(ExtraWater());       //"Yes" or "No"

            cpuPlayer.DogBreed = cpuPlayer.setCpuBreed(playerDogSize);
            cpuPlayer.DogFoodMorning = cpuPlayer.setCpuFood();
            cpuPlayer.DogFoodEvening = cpuPlayer.setCpuFood();
            cpuPlayer.DogForWater = cpuPlayer.setCpuWater();

            // print what player1 chose (player2 is CPU)
            printChosenParameters(numberOfPlayers, dogFood, player1, cpuPlayer);
            // walking, delay time and make the "final product"
            System.out.println(" \n\t It's time to go for a walk now. ");
// delay before Entry pressed (throwing)
            myThread ();

            // throw results
            float playerResult = throwIt(playerDogSize, dogFood.getMapFoodForDogs().get(player1.DogFoodMorning),
                    player1.getName(), dogFood.getMapFoodForDogs().get(player1.DogFoodEvening),
                    player1.getDogForWater());

            float CpuResult = throwIt(playerDogSize, cpuPlayer.DogFoodMorning, cpuPlayer.getName(),
                    cpuPlayer.DogFoodEvening, cpuPlayer.DogForWater);
            //float numbers compare
            compareFloat(playerResult, CpuResult, player1, cpuPlayer);
        }
//-------------------------------------------  TWO PLAYERS ------------------------------------------------//
        if (numberOfPlayers == 2) {
            //------------------------------------------- PLAYER1 ------------------------------------------------//
            System.out.println("Let Start. Player 1 \t What is your name?");
            player1.setName(bufferedReader.readLine());    // player's 1 name
            // choose the size of the dog for player1 and player2
            System.out.println("\n\t Ok, " + player1.getName() + ", please, choose the size of your dog:");
            System.out.println("\t1. Large size, \n\t2. Medium size, \n\t3. Small size");
            System.out.println("---||-----------------------------------------------------||");
// exceptionForm for playerDogSize (String)
            playerDogSize = String.valueOf(exceptionForm(bufferedReader.readLine(), 3));
            //set up distance to the trash can
            if (playerDogSize.equals("2")) { canDistance =  canDistance * 0.75f;}
            if (playerDogSize.equals("3")) { canDistance =  canDistance * 0.5f;}
            // choose the breed for player1
            player1.setDogBreed(printAndSetTheBreed(playerDogSize, dogBreed));
            // choose food and water for player1
            player1.DogFoodMorning = FoodForMorning();  // number of map-key
            player1.DogFoodEvening = FoodForEvening();  // number of map-key
            player1.setDogForWater(ExtraWater());       // player1.DogForWater

            //------------------------------------------- PLAYER2 ------------------------------------------------//
            System.out.println("Let Start. Player 2\nWhat is your name?");
            player2.setName(bufferedReader.readLine());   // player's 2 name
            // choose the size of the dog for player2 (the same size as opponent)
            System.out.println("\n\t Ok, " + player2.getName() + ", you have to have the same size of dog as your opponent, but" +
                    "\n\tyou can choose another breed:");
            // choose the breed for player2
            player2.setDogBreed(printAndSetTheBreed(playerDogSize, dogBreed));
            // choose food and water for player2
            player2.DogFoodMorning = FoodForMorning();
            player2.DogFoodEvening = FoodForEvening();
            player2.setDogForWater(ExtraWater());

            printChosenParameters(numberOfPlayers, dogFood, player1, player2);

            // walking, delay time and make the "final product"
            System.out.println(" \n\t It's time to go for a walk now. ");
// delay before Enter pressed (throwing)
            myThread ();

            float player1Result = throwIt(playerDogSize, dogFood.getMapFoodForDogs().get(player1.DogFoodMorning),
                    player1.getName(), dogFood.getMapFoodForDogs().get(player1.DogFoodEvening), player1.getDogForWater());
            float player2Result = throwIt(playerDogSize, dogFood.getMapFoodForDogs().get(player2.DogFoodMorning),
                    player2.getName(), dogFood.getMapFoodForDogs().get(player2.DogFoodEvening), player2.getDogForWater());
            bufferedReader.close();

            compareFloat(player1Result, player2Result, player1, player2);

        }
    } // main ends
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------
    // 1. method "printAndSetTheBreed"
    public static String printAndSetTheBreed(String size, DogsSizeAndBreed breed) throws IOException {
        String mapBreedValue = null;
        System.out.println("\n\t Now choose the breed of your dog:");
        BufferedReader bfr_4 = new BufferedReader(new InputStreamReader(System.in));
        if (size.equals("1")) {
            System.out.println();
            for (Map.Entry<Integer, String> pair : breed.getMapDogSizeLarge().entrySet()) {
                System.out.println(pair.getKey() + ". " + pair.getValue());
            }
//exceptionForm for LargeSizeBreed   //  map value = dog breed by key
            mapBreedValue = breed.getMapDogSizeLarge().get(exceptionForm(bfr_4.readLine(), breed.mapDogSizeLarge.size()));
        }
        if (size.equals("2")) {
            System.out.println();
            for (Map.Entry<Integer, String> pair : breed.getMapDogSizeMedium().entrySet()) {
                System.out.println(pair.getKey() + ". " + pair.getValue());
            }
//exceptionForm for MediumSizeBreed  //  map value = dog breed by key
            mapBreedValue = breed.getMapDogSizeMedium().get(exceptionForm(bfr_4.readLine(), breed.mapDogSizeMedium.size()));
        }
        if (size.equals("3")) {
            System.out.println();
            for (Map.Entry<Integer, String> pair : breed.getMapDogSizeSmall().entrySet()) {
                System.out.println(pair.getKey() + ". " + pair.getValue());
            }
//exceptionForm for SmallSizeBreed  // map value = dog breed by key
            mapBreedValue = breed.getMapDogSizeSmall().get(exceptionForm(bfr_4.readLine(), breed.mapDogSizeSmall.size()));
        }
        return mapBreedValue;
    }
    // 2. method "FoodForMorning"
    public static String FoodForMorning() throws IOException {
        BufferedReader bfr_1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\t Choose food for your dog: \n\t1. Chicken (dry dogs food); \n\t2. Beef (dry dogs food); \n\t3. Salmon (dry dogs food); " +
                "\n\t4. Cottage Cheese (human food); \n\t5. Chicken & Macaroni (human food); \n\t6. Salmon & Oatmeal (human food)" +
                "\n\n\t for morning:");
        System.out.println("---||-----------||");
//exceptionForm for DogFoodMorning
        return String.valueOf(exceptionForm(bfr_1.readLine(), 6)); // String;
    }
    // 3. method "FoodForEvening"
    public static String FoodForEvening() throws IOException {
        BufferedReader bfr_2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t for evening: ");
        System.out.println("---||-----------||");
//exceptionForm for DogFoodEvening
        return String.valueOf(exceptionForm(bfr_2.readLine(), 6)); // String;
    }
    // 4. method "ExtraWater" for dog - Yes or No
    public static String ExtraWater () throws IOException {
        System.out.println("||---------------------------------------------------------||");
        System.out.println("\t Would you like your dog to drink extra water?: \n\t1. Yes \n\t2. No");
        System.out.println("---||------------------------------------------------------||");
        BufferedReader bfr_3 = new BufferedReader(new InputStreamReader(System.in));
//exceptionForm for DogForWater
        return String.valueOf(exceptionForm(bfr_3.readLine(),2)); // String;
    }
    // 5. method "printChosenFood"
    public static void printChosenParameters(int numOfPlayers, FoodForDogs ffd, Players p1, Players p2) {
        for (int i = 0; i < numOfPlayers; ) {
            System.out.println(p1.getName() + " has a " + p1.getDogBreed() + ":\n\t Dog Food for Morning: " + ffd.getMapFoodForDogs().get(p1.DogFoodMorning));
            System.out.println("\t Dog Food for Evening: " + ffd.getMapFoodForDogs().get(p1.DogFoodEvening)
                    + "\n\t Extra Water: " + p1.getDogForWater());
            i++;
            p1=p2;
        }
        if (numOfPlayers == 1) {
            System.out.println(p2.getName() + " has a " + p2.getDogBreed() + ":\n\t Dog Food for Morning: " + p2.DogFoodMorning);
            System.out.println("\t Dog Food for Evening: " + p2.DogFoodEvening
                    + "\n\t Extra Water: " + p2.DogForWater);
        }
    }
    //-----------------------------------------------------------------------------------------------------------------------------------------//
    // 6. THROW method - the distance depends on: dog size, kind of food for morning and evening, and extra water
    public static float throwIt (String ds, String dfm, String playersName, String dfe, String dfw) {
        DogFoodTables dogFoodTables = new DogFoodTables();
        float distance;

        distance = dogFoodTables.foodTables(dfm, dfe, dfw);

        result(distanceBySize(distance, ds), playersName);
        return distance;
    }
    // 7. method "distanceBySize"
    public static float distanceBySize (float disBySize, String dsize) {
        if (dsize.equals("3")) { disBySize = disBySize * 0.5f; }
        if (dsize.equals("2")) { disBySize = disBySize * 0.75f; }
        return disBySize;
    }
    // 8. method "result"
    public static void result (float m, String plNam) {
        System.out.print("\n\t" + plNam + ", Your Result is: ");
        System.out.printf("%.2f", m);
        System.out.println(" feet");
    }
    // 9. method "exceptionForm"
    public static int exceptionForm(String number, int pp) throws IOException {
        BufferedReader bfr_ex = new BufferedReader(new InputStreamReader(System.in));
        int numb = 0;
        int temp = 0;
        while (temp == 0) {
            try {
                numb = Integer.parseInt(number);
            } catch (NumberFormatException numberFormatException) {
                System.out.print("Only numbers, please:");
            }
            if (numb >= 1 && numb <= pp) {
                temp = 1;
            } else {
                System.out.println("\tPlease, choose one from the given numbers");
                number = bfr_ex.readLine();
            }
        }
        return numb;
    }
    // 10. method "myThread"
    public static void myThread () throws IOException {

        MyThread myThread = new MyThread();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        myThread.start();
        bufferedReader.readLine();
        myThread.shutdown();
    }

    //11. method "compareFloat"
    static void compareFloat(float player1Result, float player2Result, Players pl1Name, Players pl2Name){
        if((Float.compare(player1Result, (canDistance-delta)) > 0 )  && (Float.compare(player1Result, (canDistance+delta)) < 0 )) // Player1 made it in the basket BINGO
        {
if ((Float.compare(player2Result, (canDistance+delta)) > 0 )  || (Float.compare(player2Result, (canDistance-delta)) < 0 ))  // Player2 out of can
{
    System.out.println("\nBINGO! You made it! Congratulations " + pl1Name.getName());
}else {
    System.out.println("\nBINGO! Both WOM!"); // Player1 & Player2  made it in the basket too
}
        } else //Player out of the basket
            {
            if ((Float.compare(player2Result, (canDistance-delta)) > 0 )  && (Float.compare(player2Result, (canDistance+delta)) < 0 )) //   CPU or Player2 made it in the basket BINGO
            {
                System.out.println("\n" + pl2Name.getName() + "  made it !");
            } else
                {
                    if (Float.compare(Math.abs(player1Result - canDistance), Math.abs(player2Result - canDistance)) > 0 ) {
                        System.out.println("\n" + pl2Name.getName() + " WON! Didn't make it, but it's close to the basket");
                    }else
                        {
                            System.out.println("\n" + pl1Name.getName() + " WON! Didn't make it, but it's close to the basket");
                        }
                }
        }
    }
}

