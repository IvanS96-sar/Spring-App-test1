package ru.maxima;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Radio {
    String getCurrentSong();
}

@Component("radioMaximum")
class RadioMaximum implements Radio {

    @Override
    public String getCurrentSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("Xassa - Дикари");
        listSong.add("Red Hot Chili Peppers - Californication");
        listSong.add("Любэ - Конь");
        return listSong.toString();
    }
}

@Component("radioEnergy")
class RadioEnergy implements Radio {
    @Override
    public String getCurrentSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("Анна Asti - Царица");
        listSong.add("Avicii - Levels");
        listSong.add("Андрей Бандера - Клен");
        return listSong.toString();
    }
}

@Component("radioRecord")
class RadioRecord implements Radio {
    @Override
    public String getCurrentSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("Miravi - Воля");
        listSong.add("Jakone - Дорога дальняя");
        listSong.add("Леша Свик - Замок из дождя");
        return listSong.toString();
    }
}

@Component("radioMonteCarlo")
class RadioMonteCarlo implements Radio {
    @Override
    public String getCurrentSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("Rihanna - Te amo");
        listSong.add("Blonker - Sidewalk cafe");
        listSong.add("Pochill - Stay");
        return listSong.toString();
    }
}

@Getter
@Component
public class RadioPlayer {

    private Radio radio1;
    private Radio radio2;
    private Radio radio3;
    private Radio radio4;

    @Autowired
    public RadioPlayer(@Qualifier("radioMaximum") Radio radio1,
                       @Qualifier("radioEnergy") Radio radio2,
                       @Qualifier("radioRecord") Radio radio3,
                       @Qualifier("radioMonteCarlo") Radio radio4) {
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
        this.radio4 = radio4;
    }

    public void playRadio() {
        System.out.println(radio1.getCurrentSong());
        System.out.println(radio2.getCurrentSong());
        System.out.println(radio3.getCurrentSong());
        System.out.println(radio4.getCurrentSong());
    }
}

