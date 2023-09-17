package matrix;

import java.util.Arrays;

public class Matrix {
    private double[][] values;
    private int m;
    private int n;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.values = new double[this.m][this.n];
    }

    public void fillRow(int row, double[] rowValues) {
        if (rowValues.length != this.n || row >= this.m) {
            throw new IllegalArgumentException();
        } else {
            this.values[row] = rowValues;
        }
    }

    public void fillColumn(int column, double[] columnValues) {
        if (columnValues.length != this.m || column >= this.n) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < this.m; i++) {
                this.values[i][column] = columnValues[i];
            }
        }
    }

    public void multiplyRow(int row, double constant) {
        if (row >= this.m || constant == 0) {
            throw new IllegalArgumentException();
        } else {
            for (int j = 0; j < this.n; j++) {
                this.values[row][j] *= constant;
            }
        }
    }

    public void switchRows(int firstRow, int secondRow) {
        if (firstRow == secondRow) {
            return;
        }
        if (firstRow >= this.m || this.m < secondRow) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < this.n; i++) {
                double tmp = values[firstRow][i];
                values[firstRow][i] = values[secondRow][i];
                values[secondRow][i] = tmp;
            }
        }
    }

    public void addRows(int to, int from, double constant) {
        if (to >= this.m || this.m < from) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < this.m; i++) {
                values[to][i] += values[from][i] * constant;
            }
        }
    }

    @Override
    public String toString() {
        return "Matrix{ " + Arrays.deepToString(this.values) + " }";
    }
}
