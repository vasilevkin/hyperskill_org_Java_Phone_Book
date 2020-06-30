/**
 * Object-based box class that requires casting every time you want to get some specific stuff from it, e.g.:
 * <p>
 * Box cakeBox = new Box();
 * cakeBox.put(new Cake());
 * // Without casting only object can be retrieved out of the box
 * Cake cake = (Cake) cakeBox.get();
 * <p>
 * Casting is not desirable and can fall at runtime, could you create more... generic solution?
 */
class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

}


class MyClass<T> {

    private T t;

    public MyClass(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

class NewTest {
    MyClass instance = new MyClass("Hello!");
}