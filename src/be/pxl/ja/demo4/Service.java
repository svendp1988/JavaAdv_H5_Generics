package be.pxl.ja.demo4;

public interface Service<T,U> {

	T execute(U arg);
}
