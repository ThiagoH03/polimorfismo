public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Quadrilatero quadrilatero = new Quadrilatero();
        Retangulo retangulo = new Retangulo();
        Losango losango = new Losango();
        Trapezio trapezio = new Trapezio();
        
        quadrilatero.calcularArea();
        quadrado.calcularArea();
        retangulo.calcularArea();
        losango.calcularArea();
        trapezio.calcularArea();
    }
    
}
