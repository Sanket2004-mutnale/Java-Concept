package com.Abtractionbyinterface.vehical;

public interface twowheeler {
	void start();
    default void price() {
    	System.out.println("Car price");
    }
    default void model() {
		System.out.println("Maruti 800AC");
	}
}
