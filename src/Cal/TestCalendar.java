package Cal;

import Calc.Calculator;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

class TestCalendar {

    @ParameterizedTest
    @ValueSource(ints= {1902, 1941, 1956, 1962, 1970})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        GregorianCalendar gcal = new GregorianCalendar();
        boolean excpectedResult = gcal.isLeapYear(year);

        Calendar calendar = new Calendar(year);
        boolean actualResult = calendar.isLeapYear();

        Assert.assertEquals(excpectedResult, actualResult);

    }

    @ParameterizedTest
    @ValueSource(ints= {1902, 1941, 1956, 1962, 1970})
    public void Should_check_if_year_is_leap_in_20th_century(int year) {
        GregorianCalendar gcal = new GregorianCalendar();
        boolean excpectedResult = gcal.isLeapYear(year);
        Calendar calendar = new Calendar(year);
        boolean actualResult = calendar.isLeapYear();

        Assert.assertEquals(excpectedResult, actualResult);

        actualResult = calendar.is20thCentury();

        Assert.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints= {1502, 1641, 1857, 1862, 2070})
    public void Should_check_if_year_is_leap_NOT_in_20th_century(int year) {
        GregorianCalendar gcal = new GregorianCalendar();
        boolean excpectedResult = gcal.isLeapYear(year);
        Calendar calendar = new Calendar(year);
        boolean actualResult = calendar.isLeapYear();

        Assert.assertEquals(excpectedResult, actualResult);

        actualResult = calendar.is20thCentury();

        Assert.assertTrue(actualResult);
    }

}