package OperacionesMatematicas;

import static java.lang.Math.sqrt;

public class EcuacionesDeSegundoGrado {
    private double valueZ;
    private double valueX;
    private double valueY;

    public EcuacionesDeSegundoGrado(double valueX, double valueY, double valueZ) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.valueZ = valueZ;
    }

    public double getValueY() {
        return valueY;
    }

    public void setValueY(double valueY) {
        this.valueY = valueY;
    }

    public double getValueX() {
        return valueX;
    }

    public void setValueX(double valueX) {
        this.valueX = valueX;
    }

    public double[] resolve() {
        double result[] = new double[2];
        double raiz;
        double division;
        double value = ((valueY*valueY) - (4*valueX*valueZ));

        if (value < 0) {
            return null;
        }

        if (valueX == 0) {
            return null;
        }

        raiz = sqrt(value);
        division = 2*valueX;
        result[0] = (-valueY + raiz)/division;
        result[1] = (-valueY - raiz)/division;
        return result;
    }
}
