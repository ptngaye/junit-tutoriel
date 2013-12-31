package com.ptngaye.junittutorial.dataseries.theories;

import com.ptngaye.junittutorial.dataseries.HolidaysHelper;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class HolidaysHelperTest {
    private HolidaysHelper holidaysHelper = new HolidaysHelper();

    @DataPoint
    public static Object[] year2008Dataset = {2008, LocalDate.of(2008, Month.MARCH, 23)};
    @DataPoint
    public static Object[] year2009Dataset = {2009, LocalDate.of(2009, Month.APRIL, 12)};
    @DataPoint
    public static Object[] year2010Dataset = {2010, LocalDate.of(2010, Month.APRIL, 4)};
    @DataPoint
    public static Object[] year2011Dataset = {2011, LocalDate.of(2011, Month.APRIL, 24)};
    @DataPoint
    public static Object[] year2012Dataset = {2012, LocalDate.of(2012, Month.APRIL, 8)};
    @DataPoint
    public static Object[] year2013Dataset = {2013, LocalDate.of(2013, Month.MARCH, 31)};
    @DataPoint
    public static Object[] year2014Dataset = {2014, LocalDate.of(2014, Month.APRIL, 20)};
    @DataPoint
    public static Object[] year2015Dataset = {2015, LocalDate.of(2015, Month.APRIL, 5)};
    @DataPoint
    public static Object[] year2016Dataset = {2016, LocalDate.of(2016, Month.MARCH, 27)};


    @Theory
    public void should_assert_easterDay_is_correct(Object[] dataset) {
        // Given
        int year = (Integer) dataset[0];
        LocalDate easterDayExpected = (LocalDate) dataset[1];

       //System.out.println("year="+year);

        // When
        LocalDate easterDayActual = holidaysHelper.identifyEasterDay(year);

        // Then
        assertThat(easterDayActual, is(easterDayExpected));
    }

    @Test
    public void should_assert_a_behaviour() {
        // Given

        // When

        // Then
        System.out.println("[Une methode de test qui n'est pas une Theory mais un test ordiinire !!!]");
    }
}
