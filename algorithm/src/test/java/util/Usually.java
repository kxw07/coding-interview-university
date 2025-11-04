package util;

public class Usually {

    public static int[] generateRandomNumber(int size) {
        int[] randomValueArray = new int[size];
        for (int idx = 0; idx < randomValueArray.length; idx++) {
            randomValueArray[idx] = (int) (Math.random() * size);
        }

        return randomValueArray;
    }
}
