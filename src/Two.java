public class Two {
    public static int sum(int a, int b) {
        if (b <= 0)
            return a;
        return sum(a + 1, b - 1);
    }
}
