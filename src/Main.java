public class Main {
    public static void main(String[] args) {

        Output output = new Output();
        output.go();

        for (int i = 0; i < 4; i++) {

            for (int j = 4; j > 2; j--) {
                System.out.println(i + " " + j);
            }
            if (i == 1) {
                i++;

            }


        }
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
