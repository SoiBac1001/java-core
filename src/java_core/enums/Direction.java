package java_core.enums;

public enum Direction {
    EAST("E");

    Direction(String shortCode) {
        this.shortCode = shortCode;
    }

    private final String shortCode;

    public String getShortCode() {
        return shortCode;
    }
}
