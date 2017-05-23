package birthdayCake;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;



public class BirthdayCakeTest {



    @Test
    public void when_we_have_2_candle_with_first_candle_little_than_second_blow_should_return_2() throws SizeException {

        int candlerNumber = 2;
        List<Integer> candles = new ArrayList();
        candles.add(2);
        candles.add(3);

        BirthdayCake birthdayCake = new BirthdayCake(candlerNumber, candles);

        assertThat(birthdayCake.blow()).isEqualTo(1);

    }

    @Test
    public void when_we_have_2_candle_with_first_candle_grather_than_second_blow_should_return_1() throws SizeException {
        int candlerNumber = 2;
        List<Integer> candles = new ArrayList();
        candles.add(3);
        candles.add(2);

        BirthdayCake birthdayCake = new BirthdayCake(candlerNumber, candles);

        assertThat(birthdayCake.blow()).isEqualTo(1);
    }

    @Test(expected=SizeException.class)
    public void when_candleNumber_is_not_the_same_size_of_candle_list_birthdayCake_should_return_sizeException() throws SizeException {
        int candleNumber = 20;
        List<Integer> candles = new ArrayList<Integer>();

        BirthdayCake birthdayCake = new BirthdayCake(candleNumber, candles);
    }


    @Test
    public void when_we_have_2_candle_wth_first_candle_grather_than_second_blow_should_return_1() throws SizeException {
        int candlerNumber = 10;
        List<Integer> candles = new ArrayList();
        candles.add(18);
        candles.add(90);
        candles.add(90);
        candles.add(13);
        candles.add(90);
        candles.add(75);
        candles.add(90);
        candles.add(8);
        candles.add(90);
        candles.add(43);

        BirthdayCake birthdayCake = new BirthdayCake(candlerNumber, candles);

        assertThat(birthdayCake.blow()).isEqualTo(5);
    }

    //10
//18 90 90 13 90 75 90 8 90 43
}
