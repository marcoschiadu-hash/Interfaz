

public  class Main {
    public static void main(String[] args) {
        FiguraConMetodos f1 = new Cuadrado(4);
        FiguraConMetodos f2 = new Circulo(3);

        System.out.println("Area cuadrado: " + f1.calcularArea());
        System.out.println("Area circulo: " + f2.calcularArea());
    }
}