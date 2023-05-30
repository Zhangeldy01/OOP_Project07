public class ComplexNumber {
    private double realPart; // действительная часть
    private double imaginaryPart; // мнимая часть

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }

    public double getReal() {
        return realPart;
    }

    public double getImaginary() {
        return imaginaryPart;
    }
}

