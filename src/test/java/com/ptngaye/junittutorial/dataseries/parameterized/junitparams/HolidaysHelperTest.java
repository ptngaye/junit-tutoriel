package com.ptngaye.junittutorial.dataseries.parameterized.junitparams;

import com.ptngaye.junittutorial.dataseries.HolidaysHelper;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//http://www.recreomath.qc.ca/dict_paques_d.htm
@RunWith(JUnitParamsRunner.class)
public class HolidaysHelperTest {
    public static Collection<Object[]> parametersForShould_assert_easterDay_is_correct() {
        return Arrays.asList(new Object[][]{
                {2008, LocalDate.of(2008, Month.MARCH, 23)},
                {2009, LocalDate.of(2009, Month.APRIL, 12)},
                {2010, LocalDate.of(2010, Month.APRIL, 4)},
                {2011, LocalDate.of(2011, Month.APRIL, 24)},
                {2012, LocalDate.of(2012, Month.APRIL, 8)},
                {2013, LocalDate.of(2013, Month.MARCH, 31)},
                {2014, LocalDate.of(2014, Month.APRIL, 20)},
                {2015, LocalDate.of(2015, Month.APRIL, 5)},
                {2016, LocalDate.of(2016, Month.MARCH, 27)},
        });
    }

    private HolidaysHelper holidaysHelper = new HolidaysHelper();

    @Test
    @Parameters
    public void should_assert_easterDay_is_correct(int year, LocalDate easterDayExpected) {
        // Given

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
