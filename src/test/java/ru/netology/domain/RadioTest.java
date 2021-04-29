package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

//    @Test
//    public void shouldCreate(){
//        Radio radio = new Radio();
//        assertEquals(0, radio.currentStation);
//        assertEquals(0, radio.volume);
//        assertFalse(radio.on);
//    }

    @Test
    public void shouldChangeCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSwitchToNext());
        radio.setSwitchToNext();
        assertEquals(0, radio.getCurrentStation());
    }
}