package be.pxl.ja.visitlondon;

import be.pxl.ja.robbery.Item;

public class Attraction implements Item, Comparable<Attraction> {
    private String name;
    private double days;
    private int rating;

    public Attraction(String name, double days, int rating) {
        this.name = name;
        this.days = days;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public double getWeight() {
        return days;
    }

    @Override
    public int compareTo(Attraction o) {
        return o.getRating() - this.rating;
    }

    @Override
    public String toString() {
        String days = this.days + " day" + (this.days > 1 ? "s" : "");
        return String.format("Attraction %s, takes %s and has a rating of %d", name, days, rating);
    }
}
