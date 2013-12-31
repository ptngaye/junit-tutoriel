package com.ptngaye.junittutorial.myfirsttest;

import com.ptngaye.junittutorial.dataseries.HolidaysHelper;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class HolidaysHelperTest {
    private HolidaysHelper holidaysHelper = new HolidaysHelper();

    @Test
    public void test_easterDay_in_2014_is_20_april_2014() throws Exception {
        //Given
        int year = 2014;
        LocalDate easterDayExpected = LocalDate.of(2014, Month.MARCH, 17);

        //When
        LocalDate easterDayActual = holidaysHelper.identifyEasterDay(year);

        //Then
        assertEquals(easterDayExpected, easterDayActual);
    }

    @Test
    public void testNothing() {
    }
}
