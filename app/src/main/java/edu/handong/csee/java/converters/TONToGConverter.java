package edu.handong.csee.java.converters;

public class TONToGConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double ton, g;

    /**
     * The method to get value
     * @param fromValue
     */
	public void setFromValue(double fromValue) {
		con.setFromValue(fromValue);

	}

	/**
     * The method to return the converted value
     * @return g
     */
	public double getConvertedValue() {
		ton = con.getConvertedValue();
        g = ton * 1000 * 1000;
        return g;
	}

	/**
     * The method is worthless
     */
	public void convert() {
		con.Convert();

	}

}