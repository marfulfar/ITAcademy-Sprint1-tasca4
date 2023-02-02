package months;

import java.util.ArrayList;

public class Month {

    public static boolean countMonths(ArrayList<String> monthsList){
        boolean isTwelve=false;

        if (monthsList.size()==12){
            isTwelve=true;
        }
        return isTwelve;
    }

    public static boolean isNotNull(ArrayList<String> monthsList){
        boolean isNull=false;

        if (monthsList != null){
            isNull=true;
        }
        return isNull;
    }


    public static boolean augustIsEight(ArrayList<String> monthsList){
        boolean isEight = false;

        if (monthsList.get(7).equalsIgnoreCase("august")){
            isEight=true;
        }
        return isEight;
    }

}
