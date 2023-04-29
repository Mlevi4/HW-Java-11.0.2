package ru.netology.radio;
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;
    public Radio() {
        maxStation = 9;
        maxVolume = 99;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
            return;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}