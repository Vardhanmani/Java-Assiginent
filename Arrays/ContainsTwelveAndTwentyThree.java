public class ContainsTwelveAndTwentyThree {
    public static boolean containsBoth(int[] values) {
        boolean containsTwelve = false;
        boolean containsTwentyThree = false;
        for (int value : values) {
            if (value == 12) {
                containsTwelve = true;
            } else if (value == 23) {
                containsTwentyThree = true;
            }
        }
        return containsTwelve && containsTwentyThree;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 12, 18, 23, 30 };
        System.out.println("Contains both 12 and 23: " + containsBoth(numbers));
    }
}