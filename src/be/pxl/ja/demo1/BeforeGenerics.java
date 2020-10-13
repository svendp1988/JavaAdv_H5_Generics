package be.pxl.ja.demo1;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;

import java.util.ArrayList;
import java.util.Iterator;

public class BeforeGenerics {

	public static void main(String[] args) {
		Content aReference = new Movie("Brother Bear", Rating.LITTLE_KIDS);
		//Integer luckyNumber = aReference;

		ArrayList objecten = new ArrayList();
		objecten.add(1);
		objecten.add(5.4);
		objecten.add(new Movie("Inception", Rating.MATURE));

		Iterator iterator = objecten.iterator();
		double total = 0;
		while (iterator.hasNext()) {
			total += (Double) iterator.next();
		}
		System.out.println(total);
	}
}
