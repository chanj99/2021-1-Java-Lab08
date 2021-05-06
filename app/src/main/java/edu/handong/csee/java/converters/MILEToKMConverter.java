package edu.handong.csee.java.converters;

public class MILEToKMConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double mile, km;

    /**
     * The method to get value
     * @param fromValue
     */
	public void setFromValue(double fromValue) {
		con.setFromValue(fromValue);

	}

	/**
     * The method to return the converted value
     * @return km
     */
	public double getConvertedValue() {
		mile = con.getConvertedValue();
        km = mile * 1.6;
        return km;
	}

	/**
     * The method is worthless
     */
	public void convert() {
		con.Convert();

	}

}
