import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    private static final Marker KERDO_MARKER = MarkerManager.getMarker("kérdő");
    private static final Marker KIJELENTO_MARKER = MarkerManager.getMarker("kijelentő");
    private static final Marker SOR_MARKER = MarkerManager.getMarker("sor");
    private static final Thread t = new Thread();

    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 1; i <= Integer.parseInt(args[0]); i++)
        {
            ThreadContext.put("iteration", String.valueOf(i));
            logger.fatal(SOR_MARKER,"Erdőn-mezőn nyitott szemmel,");
            logger.error(KIJELENTO_MARKER,"sok virágra lel az ember.");
            logger.warn(SOR_MARKER,"Én most őket megöntözöm,");
            logger.info("a piros tojást megköszönöm!");
            logger.debug(KERDO_MARKER,"Szabad-e locsolni?");
            t.sleep(500);
        }
    }
}
