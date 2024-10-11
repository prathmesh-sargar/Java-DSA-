public class Print_Pattern {

    public static void main(String[] args) {
        pattern4(4);
    }

    static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        int maxval = n;
        n = 2 * n;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                // this is important formula to understand it ..
                int atEveryIndex = maxval - Math.min(Math.min(i, j), Math.min(n - i, n - j));

                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int i = 0; i < 2 * n; i++) {
            int totalcolInrow = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalcolInrow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {

        for (int i = 0; i < 2 * n; i++) {

            int totalcolInrow = i > n ? 2 * n - i : i;

            for (int sp = 0; sp < n - totalcolInrow; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalcolInrow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
