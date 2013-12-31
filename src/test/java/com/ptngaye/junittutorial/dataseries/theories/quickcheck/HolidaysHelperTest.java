package com.ptngaye.junittutorial.dataseries.theories.quickcheck;

import com.pholser.junit.quickcheck.ForAll;
import com.pholser.junit.quickcheck.generator.InRange;
import com.ptngaye.junittutorial.dataseries.HolidaysHelper;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import static junit.framework.Assert.assertTrue;
import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;
import static org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public class HolidaysHelperTest {
    private HolidaysHelper holidaysHelper = new HolidaysHelper();

    @Theory
    public void should_assert_easterDay_is_sunday_and_between_22_march_and_25_april(
            @ForAll @InRange(minInt = -500, maxInt = 3000) int year) {
        // Given
        assumeThat(year, allOf(greaterThanOrEqualTo(0), lessThanOrEqualTo(2500)));

        LocalDate earlierEasterDay = LocalDate.of(year, Month.MARCH, 22);
        LocalDate latestEasterDay = LocalDate.of(year, Month.APRIL, 25);

        DayOfWeek easterDayInWeekExpected = DayOfWeek.SUNDAY;

        // When
        LocalDate easterDayActual = holidaysHelper.identifyEasterDay(year);

        // Then
        assertThat(easterDayActual.getDayOfWeek(), is(easterDayInWeekExpected));
        assertTrue(easterDayActual.isBefore(latestEasterDay) && easterDayActual.isAfter(earlierEasterDay));
    }

    @Theory
    public void should_escape_invalid_characters(@ForAll String nonTrustedContent) {
        // Given
        System.out.println("[Contenu non secure traité :]" + nonTrustedContent);

        // When
        String healthyContent = escapeHtml4(nonTrustedContent);

        // Then
        assertThat(healthyContent, not(containsString("<")));
        assertThat(healthyContent, allOf(not(containsString("<")), not(containsString(">")), not(containsString("&")), not(containsString("\""))));
        assertThat(nonTrustedContent, is(unescapeHtml4(healthyContent)));
    }

    @Test
    public void test_easterDay_in_2014_is_20_april_2014() throws Exception {
        //Given
        int year = 2014;
        LocalDate easterDayExpected = LocalDate.of(2014, Month.APRIL, 20);

        //When
        LocalDate easterDayActual = holidaysHelper.identifyEasterDay(year);

        //Then
        assertEquals(easterDayExpected, easterDayActual);
    }
}
