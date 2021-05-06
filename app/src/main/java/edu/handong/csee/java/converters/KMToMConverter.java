package edu.handong.csee.java.converters;

public class KMToMConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double km, m;
    
    /**
     * The method to get value
     * @param fromValue
     */
	public void setFromValue(double fromValue) {
		con.setFromValue(fromValue);

	}

	/**
     * The method to return the converted value
     * @return m
     */
	public double getConvertedValue() {
		km = con.getConvertedValue();
        m = km * 1000;
        return m;
	}

	/**
     * The method is worthless
     */
	public void convert() {
		con.Convert();

	}

}
