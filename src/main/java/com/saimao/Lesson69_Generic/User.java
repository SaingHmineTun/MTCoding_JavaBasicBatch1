package com.saimao.Lesson69_Generic;

public class User<P> {
    String name;
    private P password;

    public void setPassword(P p) {
        this.password = p;
    }

    public P getPassword() {
        return password;
    }

    public int getInt(int i) {
        return i;
    }

    public <I> I getValue(I value) {
        return value;
    }


}
