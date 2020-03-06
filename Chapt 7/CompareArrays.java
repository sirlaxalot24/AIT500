public class CompareArrays {
    public static boolean compare(int[] arrayOne, int[] arrayTwo) {
        boolean areEqual = false;

        // Whatever is needed to see if arrayOne and arrayTwo are equal
        // You are not allowed to use Arrays.equals method

        if ((arrayOne.length < 1) || (arrayTwo.length < 1)) {
            areEqual = false;
        } else if (arrayOne.length != arrayTwo.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]){
                    areEqual = false;
                } else {
                    areEqual = true;
                }
            }
        }


        return areEqual;
    }
}