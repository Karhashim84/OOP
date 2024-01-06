package task3;
@FunctionalInterface

public interface DataFilter <T> {
    boolean filter (T data);
}
