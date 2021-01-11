package be.pxl.ja.oefening1;

public class WorkingPlaceUtility {

	public static int getScore(WorkingPlace<? extends Car> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
