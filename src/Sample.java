
public class Sample {
    public <T> void printArray(T[] array) {
        for (T arr : array) {
            System.out.println(arr);
        }

    }

    public <T> void printArray(T[] array, int lowSubscript, int highSubscript){
        if ((lowSubscript < 1 || lowSubscript > array.length) || highSubscript > array.length)
            throw new IllegalArgumentException("Has illegalArgumentException .");

        else {
            for (int i=lowSubscript ; i<=highSubscript ; i++){
                System.out.println(array[i - 1]);
            }
        }
    }

}
