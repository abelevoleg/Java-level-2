package HW2;

public class Main {
    public static void main(String[] args) {
        String string = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 1";
        String[][] stringArray;
        double result = 0;

        try {
            stringArray = TransferString.TransString(string);
            result = TransInt.transferInt(stringArray);
            System.out.println(result);
        }
        catch (ArrayException e){
            System.out.println(e.getMessage());
        }
        catch (DataException e){
            System.out.println(e.getMessage());
        }
    }
}
