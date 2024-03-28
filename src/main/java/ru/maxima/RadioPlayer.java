package ru.maxima;

interface Radio {
    String getCurrentSong();
}

class RadioMaximum implements Radio {

    private String song;
    private String song1;
    private String song2;

    public RadioMaximum(String song, String song1, String song2) {
        this.song = song;
        this.song1 = song1;
        this.song2 = song2;
    }

    @Override
    public String getCurrentSong() {
        return song + ", " + song1 + ", " + song2;
    }
}

class RadioEnergy implements Radio {
    private String song;
    private String song1;
    private String song2;

    public RadioEnergy(String song, String song1, String song2) {
        this.song = song;
        this.song1 = song1;
        this.song2 = song2;
    }

    @Override
    public String getCurrentSong() {
        return song + ", " + song1 + ", " + song2;
    }
}

class RadioRecord implements Radio {
    private String song;
    private String song1;
    private String song2;

    public RadioRecord(String song, String song1, String song2) {
        this.song = song;
        this.song1 = song1;
        this.song2 = song2;
    }

    @Override
    public String getCurrentSong() {
        return song + ", " + song1 + ", " + song2;
    }
}

public class RadioPlayer {

    private Radio radio;

    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }

    public void playRadio() {
        System.out.println(radio.getCurrentSong());
    }
}
