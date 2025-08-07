package Generics;

interface container<T> {

  void add(T item);

  T get();

}

public class GenericContainer<T> implements container<T> {

  private T item;

  @Override
  public void add(T item) {
    this.item = item;
  }

  @Override
  public T get() {
    return item;
  }

}
