package com.Abtractionbyinterface;

public interface A {
	void ab();
	void ac();
    static void ad() {
    	System.out.println("static method");
	}
    default void ae() {
    	System.out.println("method ae");
    }
}
