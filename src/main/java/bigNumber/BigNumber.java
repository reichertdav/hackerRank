package bigNumber;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigNumber {


    private int numberToCompute;
    private String stringNumber;

    public BigNumber(int numberToCompute, String stringNumber) {
        this.numberToCompute = numberToCompute;
        this.stringNumber = stringNumber;
    }

    public BigInteger sum() {
        BigInteger result = new BigInteger("0");
        List<BigInteger> numbers = converterStringToBigNumber();
        for (BigInteger number: numbers) {
            result = result.add(number);
        }
        return result;
    }


    List<BigInteger> converterStringToBigNumber(){
        String[] stringNumbers = stringNumber.split(" ");
        List<BigInteger> numbers = new ArrayList<BigInteger>();
        for (String stringNumber : stringNumbers) {
            numbers.add(new BigInteger(stringNumber));
        }
        return numbers;
    }
}
