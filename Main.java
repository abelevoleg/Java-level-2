package lesson5.hw5;

public class Main{
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        arrayAction();
        arrayActionThread();
    }

    /* Первый метод: создает массив, заполняет его единицами, производит вычисления и выводит время */
    private static void arrayAction(){
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    /* Второй метод - те же действия с разбивкой на 2 потока */
    private static void arrayActionThread(){
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread t1 = new MyThread("t1", a1);
        MyThread t2 = new MyThread("t2", a2);

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[size-1]); /* Проверка, дошли ли изменения до последнего элемента массива */
    }
}
