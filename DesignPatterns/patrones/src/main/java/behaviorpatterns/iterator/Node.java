package behaviorpatterns.iterator;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> setValue(T value) {
        this.value = value;
        return this;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> setNext(Node<T> next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return "value=" + value;
    }
}
