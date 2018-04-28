package Variables_Datatypes_Operators;

public class Challenge {
    public static void main(String[] args) {
        byte byteValue = 64;
        short shortValue = 32767;
        int integerValue = 1000;

        long myLongValue = 50000L + 10L * (byteValue + shortValue + integerValue);

        short myShortValue = (short) (500 + 10 * (byteValue + integerValue));

        System.out.println("My Long Value = " + myLongValue);
    }

}
