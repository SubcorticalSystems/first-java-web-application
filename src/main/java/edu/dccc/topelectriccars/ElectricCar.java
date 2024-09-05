package edu.dccc.topelectriccars;
import java.text.NumberFormat;


public class ElectricCar {
    String model;
    String imgSrc;
    double basePrice;
    int epaMaxRange;
    String epaFuelEconomy;
    int rank;

    public ElectricCar(String model, String imgSrc, double basePrice, int epaMaxRange, String epaFuelEconomy, int rank) {
        this.model = model;
        this.imgSrc = imgSrc;
        this.basePrice = basePrice;
        this.epaMaxRange = epaMaxRange;
        this.epaFuelEconomy = epaFuelEconomy;
        this.rank = rank;
    }

    public String getModel() {return model;}

    public String getImgSrc() {return imgSrc;}

    public double getBasePrice() {return basePrice;}

    public int getEpaMaxRange() {return epaMaxRange;}

    public String getEpaFuelEconomy() {return epaFuelEconomy;}

    public int getRank() {return rank;}

    public String getFormattedBasePrice() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(basePrice);
    }

}
