public class FlipCoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TIMES THE COIN NEEDS TO BE FLIPPED:");
        int no_of_flips = input.nextInt();
        //declaring constants
        int head_count = 0;
        int tail_count = 0;
        //logic
        for (int i = 1; i < no_of_flips; i++) {
            int coin_flip = (int) Math.floor(Math.random() * 2);
            if (coin_flip == 1) {
                head_count++;
            } else {
                tail_count++;
            }
        }

            System.out.println("HEAD COUNT :" + head_count);
            int head_percentage = (int) ((head_count / no_of_flips) * 100);
            System.out.println("HEADS PERCENTAGE :" + head_percentage + "%");
            System.out.println("TAIL COUNT :" + tail_count);
            int tail_percentage = (int) ((tail_count / no_of_flips) * 100);
            System.out.println("TAILS PERCENTAGE:" + tail_percentage + "%");
        }
}
