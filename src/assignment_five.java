public class assignment_five {
    public static void main(String[] strings) {
        int heads = 0;
        int tails = 0;
        int i;

        for ( i = 0 ; i<1000000 ; i ++) {

            int coinF = (int) (Math.random()*2);
            if (coinF == 1){
                heads ++;
            }else
                tails ++;

        }

        System.out.println("the number of heads is " + heads + "the number of tails is "+ tails);
    }
}
