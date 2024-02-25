/**
 * Ticker
 */
public class Ticker {

    /**
     * Singleton instance of Ticker
     */
    private static Ticker ticker;

    /**
     *lineSeperator returns the line seperator of the operating system is executed on
     */
    private static final String LINE_SEP = System.lineSeparator();


    /**
     * String to separate the message with.
     */
    public static final String MESSAGE_SEP = "+++";

    private Ticker(){};    
    
    /**
     * Returns the singleton instance of Ticker.
     * Creates a new instance if Ticker does't exist yet.
     * @return singleton Instance of Ticker
     */
    public static Ticker getInstance(){
        if (ticker == null) {
            ticker = new Ticker();
        }
        return ticker;
    }

    /**
     * Prints the given text on one line, replacing line seperators by space and seperates it with 
     * (@value #MESSAGE_SEP) from the already printed information.
     * @param text The text that should be printed
     */
    public void print(String text){
        text = text.replace(LINE_SEP, " ");
        System.out.print(MESSAGE_SEP + text);
    }
}