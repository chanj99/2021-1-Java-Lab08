package edu.handong.csee.java.converters;

public class TONToKGConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double ton, kg;

    /**
     * The method to get value
     * @param fromValue
     */
	public void setFromValue(double fromValue) {
		con.setFromValue(fromValue);

	}

	/**
     * The method to return the converted value
     * @return kg
     */
	public double getConvertedValue() {
		ton = con.getConvertedValue();
        kg = ton * 1000;
        return kg;
	}

	/**
     * The method is worthless
     */
	public void convert() {
		con.Convert();

	}

}
