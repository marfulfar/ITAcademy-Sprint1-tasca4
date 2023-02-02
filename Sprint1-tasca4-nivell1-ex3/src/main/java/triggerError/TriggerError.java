package triggerError;

public class TriggerError {

    public static void triggerError() throws ArrayIndexOutOfBoundsException{
        Integer[] list = {1,2,3};

        try {
            System.out.println(list[4]);

        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException();
        }
    }


}
