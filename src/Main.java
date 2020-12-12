
public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();
        Character[] characters = {'a', 'd', 'f', 'k', 'h', 'R'};
        Integer[] integers = {10, 1, 5, 4, 8, 15};
        Double[] doubles = {10.1, 25.7, 5.3, 6.64, 7.5};

        sample.printArray(characters);
        sample.printArray(integers);
        sample.printArray(doubles);

        sample.printArray(characters, 1, 6);
        sample.printArray(integers, 1, 6);
        sample.printArray(doubles,1, 5);

        String[] strings = {"Ali", "Karim", "Hasan", "Maria", "Samir", "Lisa", "Parviz"};
        sample.printArray(strings);
    }
}
