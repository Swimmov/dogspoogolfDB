import java.util.Random;

public class DogFoodTables {
    public float tabDistance;

    public float foodTables (String tabDfm, String tabDfe, String tabDfw ) {

        //----------------------------------=1=------------------------------------//
        if (tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Chicken & Macaroni (human food)") && (tabDfw.equals("No")) ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("No")
        ) {
            tabDistance = (new Random().nextFloat() * (5.25f) + 70.75f);
        }
        //----------------------------------=2=------------------------------------//
        if (tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("No")   ||
                tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("Yes")
        )
        {
            tabDistance = (new Random().nextFloat() * (10.25f) + 65.75f);
        }

        //----------------------------------=3=------------------------------------//
        if (tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("No")   ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("Yes")
        )
        {
            tabDistance = (new Random().nextFloat() * (5.25f) + 65.75f);
        }

        //----------------------------------=4=------------------------------------//
        if (tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("No")   ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("Yes")
        )
        {
            tabDistance = (new Random().nextFloat() * (10.25f) + 60.75f);
        }

        //----------------------------------=5=------------------------------------//
        if (tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("Yes")   ||
                tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Salmon & Oatmeal (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("No")
        )
        {
            tabDistance = (new Random().nextFloat() * (5.25f) + 60.75f);
        }

        //----------------------------------=6=------------------------------------//
        if (tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("Yes")   ||
                tabDfm.equals("Salmon (dry dogs food)") && tabDfe.equals("Salmon (dry dogs food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Cottage Cheese (human food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("Yes") ||
                tabDfm.equals("Beef (dry dogs food)") && tabDfe.equals("Chicken (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken (dry dogs food)") && tabDfe.equals("Beef (dry dogs food)") && tabDfw.equals("No") ||
                tabDfm.equals("Chicken & Macaroni (human food)") && tabDfe.equals("Cottage Cheese (human food)") && tabDfw.equals("No") ||
                tabDfm.equals("Salmon & Oatmeal (human food)") && tabDfe.equals("Chicken & Macaroni (human food)") && tabDfw.equals("No")
        )
        {
            tabDistance = (new Random().nextFloat() * (10.25f) + 55.75f);
        }
        return tabDistance;
    }
}
