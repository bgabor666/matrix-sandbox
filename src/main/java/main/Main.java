package main;

import matrix.Matrix;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var matrix = new Matrix(3, 3);

        matrix.fillRow(0, IntStream.rangeClosed(1, 3).mapToDouble(num -> (double)num).toArray());
        matrix.fillRow(1, IntStream.rangeClosed(4, 6).mapToDouble(num -> (double)num).toArray());
        matrix.fillRow(2, IntStream.rangeClosed(7, 9).mapToDouble(num -> (double)num).toArray());

        System.out.println(matrix);

        matrix.fillColumn(0, IntStream.of(1, 4, 7).mapToDouble(num -> (double)num).toArray());
        matrix.fillColumn(1, IntStream.of(2, 5, 8).mapToDouble(num -> (double)num).toArray());
        matrix.fillColumn(2, IntStream.of(3, 6, 9).mapToDouble(num -> (double)num).toArray());

        System.out.println(matrix);

        matrix.multiplyRow(0, 2);

        System.out.println(matrix);

        matrix.switchRows(0, 1);

        System.out.println(matrix);

        matrix.addRows(1, 0, 2);

        System.out.println(matrix);
    }
}
