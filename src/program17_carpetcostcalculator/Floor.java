package program17_carpetcostcalculator;

public class Floor {
    private double width; // variable 1
    private double length;
    public Floor(double width, double length){  // parameterized constructor initializing the value
        if (width>0 && length<0){  // Nested if else to set values acc. to the conditions given in requirement
            this.width = width;
            this.length = 0.0;
        } else if (width<0 && length>0) {
            this.width = 0.0;
            this.length = length;
        } else if (width<0 && length<0) {
            this.width = 0.0;
            this.length = 0.0;
        }else {
           this.width = width;
            this.length = length;
        }
    }
    public double getArea(){
        return this.width * this.length;
    }

}
