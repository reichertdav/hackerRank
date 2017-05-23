package birthdayCake;

import java.util.List;

/**
 * Created by david on 5/22/17.
 */
public class BirthdayCake {

    private int candleNumber;
    private List<Integer> candles;


    public BirthdayCake(int candleNumber, List<Integer> candles) throws SizeException {
        verifyCandleNumber(candleNumber, candles);
        this.candleNumber = candleNumber;
        this.candles = candles;
    }

    private void verifyCandleNumber(int candleNumber, List<Integer> candles) throws SizeException {
        if(candleNumber != candles.size()){
            throw new SizeException();
        }
    }

    public int blow() {
        int candleBlow = 0;
        int candleMaxSize = 0;
        for (Integer candle: candles) {
            if(candle > candleMaxSize){
                candleBlow  = 1;
                candleMaxSize = candle;
            }
            else if(candle == candleMaxSize){
                candleBlow++;
            }

        }
        return candleBlow;
    }
}
