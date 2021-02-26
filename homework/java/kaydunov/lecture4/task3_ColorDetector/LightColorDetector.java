package task3_ColorDetector;

import java.awt.*;

/**
 *  /*
 Программа должна определять цвет в зависимости от длины волны в соответствии со следующими правилами:

 380 ... 449 - Фиолетовый ("Violet")
 450 ... 494 - Синий ("Blue")
 495 ... 569 - Зеленый ("Green")
 570 ... 589 - Желтый ("Yellow")
 590 ... 619 - Оранжевый ("Orange")
 620 ... 750 - Красный ("Red")
 Вне диапазонов - невидимый спектр ("Invisible Light")
 */
public class LightColorDetector {
    Color color;
    int wavelength;

    public String detect(int wavelength) {
        if (wavelength < 380) return "Invisible Light";
        if (wavelength < 449) return "Фиолетовый";
        if (wavelength < 493) return "Синий";
        if (wavelength < 569) return "Зеленый";
        if (wavelength < 589) return "Желтый";
        if (wavelength < 619) return "Оранжевый";
        if (wavelength < 750) return "Красный";
        return "Invisible Light";
    }



}
