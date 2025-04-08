package com.itheima.generic;

public class JuiceMachine<T> implements Machine<T> {

    private T taste;

    public T getTaste() {
        return taste;
    }

    public void setTaste(T taste) {
        this.taste = taste;
    }

    @Override
    public T make() {
        return taste;
    }

    @Override
    public String toString() {
        return "JuiceMachine{" +
                "taste=" + taste +
                '}';
    }
}
