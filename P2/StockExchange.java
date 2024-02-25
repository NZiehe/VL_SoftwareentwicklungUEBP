public class StockExchange {
    /**
     * Reads in one argument as an int. Three times as many instances of Company will be created.
     * Then 2/3 of the newly created Company instances will be set to null and the garbage collector is called.
     * After that, the ermaining 1/3 Company instances will be set to null.
     * @param args One integer argument expected which represents 1/3 of the companies created.
     */
    public static void main(String[] args) {
        
        //Error handling
        if (args.length != 1) {
            System.out.println("Error, expected one integer argument!");
            System.out.println("Terminating programm");
            System.exit(-1);
        }

        final int N = Integer.parseInt(args[0]);
        Company c[] = new Company[3 * N];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Company("GOAT_" + i);
        }

        for (int i = 0; i < 2 * N; i++) {
            System.out.println(c[i].getName());
            c[i] = null;
        }

        //Calling garbage collector to see the destuctor message
        System.gc();

        for (int i = 2 * N; i < 3 * N; i++) {
            System.out.println(c[i].getName());
            c[i] = null;
        }

        /**
         * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
         * Endless loop in order to wait for the garbage collector to start and see the destructor message
         */
        while (true);
    }
}
