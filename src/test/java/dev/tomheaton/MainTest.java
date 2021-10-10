package dev.tomheaton;

public class MainTest {

    public static void main(String[] args) {
        ForestLogger logger = new ForestLogger("test");

        logger.info("information here");
        logger.warn("warning here");
        logger.error("error here");
    }
}
