package OperacionesMatematicas;

import java.util.ArrayList;

public class ReglaDeCramer {

    private int values[][] = new int[3][4];

    public ReglaDeCramer(int[][] values) {
        this.values = values;
    }

    public int[][] getValues() {
        return values;
    }

    public int[] resolve() {
        int result[] = new int[3];
        int determinanteA;
        int determinanteB;
        int determinanteC;
        int determinanteDelSistema;

        int determinanteDelSistemaValues[][] = {{values[0][0], values[0][1], values[0][2]},
                                                {values[1][0], values[1][1], values[1][2]},
                                                {values[2][0], values[2][1], values[2][2]}};

        determinanteDelSistema = determinante( determinanteDelSistemaValues);

        if (determinanteDelSistema != 0) {
            int determinanteAValues[][] = {{values[0][3], values[0][1], values[0][2]},
                                            {values[1][3], values[1][1], values[1][2]},
                                            {values[2][3], values[2][1], values[2][2]}};
            int determinanteBValues[][] = {{values[0][0], values[0][3], values[0][2]},
                                            {values[1][0], values[1][3], values[1][2]},
                                            {values[2][0], values[2][3], values[2][2]}};
            int determinanteCValues[][] = {{values[0][0], values[0][1], values[0][3]},
                                            {values[1][0], values[1][1], values[1][3]},
                                            {values[2][0], values[2][1], values[2][3]}};

            determinanteA = determinante(determinanteAValues);
            determinanteB = determinante(determinanteBValues);
            determinanteC = determinante(determinanteCValues);

            result[0] = determinanteA;
            result[1] = determinanteB;
            result[2] = determinanteC;
            return result;

        } else {
            return null;
        }
    }

    private int determinante(int datos[][]) {
        int determinante = 0;

        determinante = (datos[0][0]*datos[1][1]*datos[2][2])
                    + (datos[0][1]*datos[1][2]*datos[2][0])
                    + (datos[0][2]*datos[1][0]*datos[2][1])

                    - (datos[0][2]*datos[1][1]*datos[2][0])
                    - (datos[0][1]*datos[1][2]*datos[2][0])
                    - (datos[0][2]*datos[1][0]*datos[2][1]);

        return determinante;
    }
}