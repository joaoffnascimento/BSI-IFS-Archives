package questao01;

public interface IPilha {
    int size();
    void push(Object object);
    Object pop();
    boolean isEmpty();
    boolean isFull();
    Object top();
}
