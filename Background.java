package circles;

import java.awt.*;

public class Background {
    int n = 0; /* коэффициент замедления */
    Color colorBackground; /* цвет канвы */

    /* Конструктор класса, задающий цвет */
    Background(){
        colorBackground = new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
    }

    /* Передача цвета для отрисовки. Цвет меняется в зависимости от времени, задаваемого коэффициентом замедления n */
    protected Color getColor(){
        if (getNumber() == 0) {
            colorBackground = new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)
            );
        }
        return colorBackground;
    }

    /* Реализация замедления через коэффициент замедления n */
    private int getNumber(){
        n++;
        if (n == 50) n = 0;
        return n;
    }
}
