package Variables_Datatypes_Operators;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //int has a width of 32.
        int myMixValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myNewIntValue = (myMaxValue / 2);

        //byte has a width of 8.
        //Casting, insert a (byte) before the operation in variable.
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue / 2);

        //short has a width of 16.
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        //long has a width of 64 (double of int variable).
        long myLongValue = 100L;


    }

}
