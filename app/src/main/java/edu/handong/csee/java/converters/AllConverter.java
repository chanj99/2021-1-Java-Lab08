package edu.handong.csee.java.converters;

public class AllConverter {
	private double toValue, cValue1, cValue2;
    private String getMeasure, cMeasure1, cMeasure2;

    /**
     * The method to get value
     * @param fromValue
     * @return this
     */
    public AllConverter setFromValue(double fromValue) {
        toValue = fromValue;

        return this;
    }

    /**
     * The method to convert measure
     * @param originalMeasure
     * @return this
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        getMeasure = originalMeasure;
        if(getMeasure.equals("KM")) {
            cMeasure1 = "M";
            cMeasure2 = "MILE";
        } else if(getMeasure.equals("TON")) {
            cMeasure1 = "KG";
            cMeasure2 = "G";
        } else if(getMeasure != "KM" && getMeasure != "TON") {
            cMeasure1 = "E";
        }

        return this;
    }

    /**
     * The method to convert value and print out
     * @return this
     */
    public AllConverter convertAndPrintOut() {
        if(cMeasure1.equals("M")) {
            cValue1 = toValue * 1000;
            cValue2 = toValue / 1.6;
        } else if(cMeasure1.equals("KG")) {
            cValue1 = toValue * 1000;
            cValue2 = toValue * 1000 * 1000;
        }

        if(cMeasure1 != "E") {
            System.out.println(toValue + " " + getMeasure + " to " + cValue1 + " " + cMeasure1);
            System.out.println(toValue + " " + getMeasure + " to " + cValue2 + " " + cMeasure2);
        } else {
            System.out.println("AllConverter cannot support the measure!");
        }
        return this;
    }
}