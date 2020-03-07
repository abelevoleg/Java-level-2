package HW2;

public class TransInt {
    static double transferInt(String[][] stringArrayFinish) throws DataException{
        int summ = 0;
        double halfSumm;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!stringArrayFinish[i][j].matches("\\d+")) throw new DataException("в одной из ячеек полученной матрицы не число: " + stringArrayFinish[i][j]);
                summ = summ + Integer.parseInt(stringArrayFinish[i][j].trim());
            }
        }
        halfSumm = summ / 2.0;
        return halfSumm;
    }
}
