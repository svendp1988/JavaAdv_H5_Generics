package be.pxl.ja.demo2;

import be.pxl.ja.demo2.Duo;
import be.pxl.ja.streamingservice.model.Actor;

public class DifferentDuos {

	public static void main(String[] args) {
		Duo<String> cocktail = new Duo<>("gin", "tonic");
		Duo<Actor> famousDuo = new Duo<>(new Actor("Ben","Stiller"), new Actor("Owen", "Wilson"));
		Duo<Integer> numbers = new Duo<>(5, 12);
	}

}
