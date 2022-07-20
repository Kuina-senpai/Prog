package Ab11;

import java.util.Scanner;

public class Matrix {
    private double[][] feld;

    public Matrix(int z, int s){
        this.feld = new double[z][s];
    }
    public Matrix(int n){
        this.feld = new double[n][n];
    }
    public Matrix(Matrix ref){
        this.feld = ref.feld;
    }
    public int zeilen(){
        return feld.length;
    }
    public int spalten(){
        return feld[0].length;
    }
    public double get(int z, int s)throws IllegalArgumentException{
        if (z > feld.length || s > feld[z].length){
            throw  new IllegalArgumentException();
        }
        return feld[z][s];
    }
    public double[][] set(int z, int s, double e)throws IllegalArgumentException{
        if (z > feld.length || s > feld[z].length){
            throw  new IllegalArgumentException();
        }
        this.feld[z][s] = e;
        return feld;
    }
    public double[][] setAll(double e){
        for (int a = 0; a < feld.length; a++){
            for (int b = 0; b < feld[a].length; b++){
                feld[a][b] = e;
            }
        }
        return feld;
    }
    public double[][] setZeile (int z, double[] f)throws IllegalArgumentException{
        if (z > feld.length){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < feld[z].length; i++){
            feld[z][i] = f[i];
        }
        return feld;
    }
    public double[][] setSpalte(int s, double[] f)throws IllegalArgumentException{
        if (s > feld[s].length){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < feld.length; i++){
            feld[i][s] = f[i];
        }
        return feld;
    }
    public boolean equals(Matrix ref){
        if (feld.length != ref.feld.length){
            return false;
        }
        for (int a = 0; a < feld.length; a++){
            if (feld[a].length != ref.feld[a].length){
                return false;
            }
            for (int b = 0; b < feld[a].length; b++){
                if (feld[a][b] - ref.feld[a][b] > 0.00001){
                    return false;
                }
            }
        }
        return true;
    }
    public String toString(){
        for (int a = 0; a < feld.length; a++){
            System.out.print("(");
            for (int b = 0; b < feld[a].length; b++){
                System.out.print(" " + feld[a][b]);
            }
            System.out.print(" )");
            System.out.println();
        }
        return "";
    }
    public Matrix eingabe(Scanner sc){
        for (int x = 0; x < zeilen(); ++x) {
            if (!sc.hasNext()) {
                throw new java.util.InputMismatchException("Falsche Eingabe!");
            }
            String s = sc.next();
            if (!s.equals("(")) {
                throw new java.util.InputMismatchException("Falsche Eingabe!");
            }
            for (int y = 0; y < spalten(); ++y) {
                if (!sc.hasNext()) {
                    throw new java.util.InputMismatchException("Falsche Eingabe!");
                }
                s = sc.next();
                if (!s.contains(".") || s.length() < 3) {
                    throw new java.util.InputMismatchException("Falsche Eingabe!");
                }
                int i = s.indexOf('.');
                String a = s.substring(0, i);
                String b = s.substring(i + 1);
                if (!Character.isDigit(a.charAt(0)) || a.charAt(0) == '-' || a.charAt(0) == '+') {
                    throw new java.util.InputMismatchException("Falsche Eingabe!");
                }
                for (int n = 1; n < a.length(); ++n) {
                    if (!Character.isDigit(a.charAt(n))) {
                        throw new java.util.InputMismatchException("Falsche Eingabe!");
                    }
                }
                for (int c = 0; c < b.length(); ++c) {
                    if (!Character.isDigit(a.charAt(c))) {
                        throw new java.util.InputMismatchException("Falsche Eingabe!");
                    }
                }
                this.set(x, y, Double.parseDouble(s));
            }
            s = sc.next();
            if (!s.equals(")")) {
                throw new java.util.InputMismatchException("Falsche Eingabe!");
            }
        }
        if (sc.hasNext()) {
            throw new java.util.InputMismatchException("Falsche Eingabe!");
        }
        return this;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix a = new Matrix(6,9);
        a.eingabe(sc);
    }
}
