package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int switchToNext;
    private int switchToPrev;

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int plus;
    private int minus;



    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getSwitchToNext() {
        return switchToNext;
    }

    public void setSwitchToNext(int switchToNext) {
        this.switchToNext = switchToNext;
    }

    public int getSwitchToPrev() {
        return switchToPrev;
    }

    public void setSwitchToPrev(int switchToPrev) {
        this.switchToPrev = switchToPrev;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }
}
