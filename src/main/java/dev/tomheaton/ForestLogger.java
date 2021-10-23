package dev.tomheaton;
import dev.tomheaton.util.Colours;

public class ForestLogger {

    private final String name;
    private final String prefix;

    public ForestLogger() {
        this("default");
    }

    public ForestLogger(String name) {
        this(name, "[" + name + "]");
    }

    public ForestLogger(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }

    public String getName() {
        return this.name;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void info(String message) {
        System.out.println(Colours.ANSI_GREEN + message);
    }

    public void error(String message) {
        System.out.println(Colours.ANSI_RED + message);
    }

    public void warn(String message) {
        System.out.println(Colours.ANSI_YELLOW + message);
    }
}