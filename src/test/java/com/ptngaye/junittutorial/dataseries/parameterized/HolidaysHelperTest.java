package com.ptngaye.junittutorial.dataseries.parameterized;

import com.ptngaye.junittutorial.dataseries.HolidaysHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class HolidaysHelperTest {
    @Parameterized.Parameters(name = "[Jeu de tests #{index}] En {0}, la fete  de Paques doit etre le {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2008, LocalDate.of(2008, Month.MARCH, 23)},
                {2009, LocalDate.of(2009, Month.APRIL, 12)},
                {2010, LocalDate.of(2010, Month.APRIL, 4)},
                {2011, LocalDate.of(2011, Month.APRIL, 24)},
                {2012, LocalDate.of(2012, Month.APRIL, 29)},
                {2013, LocalDate.of(2013, Month.MARCH, 31)},
                {2014, LocalDate.of(2014, Month.APRIL, 20)},
                {2015, LocalDate.of(2015, Month.APRIL, 5)},
                {2016, LocalDate.of(2016, Month.MARCH, 27)},
        });
    }

    public HolidaysHelperTest(int year, LocalDate easterDayExpected) {
        this.year = year;
        this.easterDayExpected = easterDayExpected;
    }

    private int year;
    private LocalDate easterDayExpected;

    private HolidaysHelper holidaysHelper = new HolidaysHelper();

    @Test
    public void should_assert_easterDay_is_correct() {
        // Given

        // When
        LocalDate easterDayActual = holidaysHelper.identifyEasterDay(year);

        // Then
        assertThat(easterDayActual, is(easterDayExpected));
    }
}
