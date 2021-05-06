package edu.handong.csee.java.converters;

public class KMToMILEConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double km, mile;

    /**
     * The method to get value
     * @param fromValue
     */
	public void setFromValue(double fromValue) {
		con.setFromValue(fromValue);

	}

	/**
     * The method to return the converted value
     * @return mile
     */
	public double getConvertedValue() {
		km = con.getConvertedValue();
        mile = km / 1.6;
        return mile;
	}

	/**
     * The method is worthless
     */
	public void convert() {
		con.Convert();

	}

}