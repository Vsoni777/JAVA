
class TestDf{

    public static void main(String[] args) {
        System.out.println(average(1, 2, 3, 4, 5)); // Example usage
    }

    public static double average(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}

  