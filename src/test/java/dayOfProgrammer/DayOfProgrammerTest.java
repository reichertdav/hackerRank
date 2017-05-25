package dayOfProgrammer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DayOfProgrammerTest {

    @Test
    public void when_the_year_is_after_1919_anf_the_year_is_non_leap_year_dayOfProgrammer_should_return_13_09_X() {
        DayOfProgrammer dayOfProgrammer = new DayOfProgrammer(2001);
        assertThat(dayOfProgrammer.getDate()).isEqualTo("13.09.2001");
    }

    @Test
    public void when_the_year_is_after_1919_anf_the_year_is_leap_year_dayOfProgrammer_should_return_12_09_X() {
        DayOfProgrammer dayOfProgrammer = new DayOfProgrammer(2000);
        assertThat(dayOfProgrammer.getDate()).isEqualTo("12.09.2000");
    }

    @Test
    public void when_year_is_divisible_by400_isLeapYear_should_return_true() {
        DayOfProgrammer dayOfProgrammer = new DayOfProgrammer(800);
        assertThat(dayOfProgrammer.isLeapYear()).isTrue();
    }

    @Test
    public void when_year_is_divisible_by_4_but_not_by_100_isLeapYear_should_return_True() {
        DayOfProgrammer dayOfProgrammer = new DayOfProgrammer(2008);
        assertThat(dayOfProgrammer.isLeapYear()).isTrue();
    }

    @Test
    public void when_year_is_1918_dayOfProgrammer_should_return_() {
        DayOfProgrammer dayOfProgrammer = new DayOfProgrammer(1918);
        assertThat(dayOfProgrammer.getDate()).isEqualTo("26.09.1918");
    }
}