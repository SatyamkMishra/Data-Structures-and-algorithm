class Tower_of_hanoi {
    public static void toh(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + s + " to " + d);
            return;
        }

        toh(n - 1, s, d, h);
        System.out.println("Transfer disk " + n + " from " + s + " to " + d);
        toh(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        toh(3, "S", "H", "D");
    }
}