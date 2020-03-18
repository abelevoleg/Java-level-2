package lesson5.hw5;

public class MyThread extends Thread {
    private float[] a;

    public MyThread(String name, float[] a) {
        super(name);
        this.a = a;
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        for (int i = 0; i < a.length; i++) {
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        /* В задании не очень понятно, нужно ли, чтобы i в тригонометрических формулах для второго массива считались
        * не с 0, а с середины стартового массива. Усложнять не стал, оставил просто i */
        System.out.println(getName() + " stopped");
    }
}
