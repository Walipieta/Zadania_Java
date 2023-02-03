package Creatures;

public interface Feedable {
    default void feed(){}
    default void feed(double weigth){}
}
