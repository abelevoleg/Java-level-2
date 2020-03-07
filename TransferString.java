package HW2;

public class TransferString {
    static String[][] TransString(String string) throws ArrayException{
        String[] stringArray = string.split("\n");
        String[][] stringArrayFinish = new String[4][4];

        if (stringArray.length != 4) throw new ArrayException("размер матрицы, полученной из строки, не равен 4x4, не хватает строк");

        for (int i = 0; i < 4; i++) {
            String[] stringArrayNext = stringArray[i].split(" ");
            if (stringArrayNext.length != 4) throw new ArrayException("размер матрицы, полученной из строки, не равен 4x4, ошибка в " + (i + 1) + " строке");
            for (int j = 0; j < 4; j++) {
                stringArrayFinish[i][j] = stringArrayNext[j];
            }
        }
        return stringArrayFinish;
    }
}
