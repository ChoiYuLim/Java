package com.yulim.day_0315.Problem12;

public abstract class TangibleAsset extends Asset implements Thing {

    private double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name, price, color);
    }
    
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

}
