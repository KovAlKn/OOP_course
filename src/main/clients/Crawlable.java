package main.clients;

public interface Crawlable extends Goable{
    @Override
    default double getRunSpeed() {
        return 2D;
    }
}
