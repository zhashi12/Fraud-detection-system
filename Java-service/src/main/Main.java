package main;
public class Main {
    public static void main(String[] args) {
        Fraud trial = new Fraud();
        try {
            trial.csvTranslate();
        } catch (Exception e) {
            System.out.println("fail");
        }
        System.out.println("Hello world!");
    }
}