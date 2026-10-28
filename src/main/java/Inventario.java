
public class Inventario{
    public static int calculadorasubtotal(int precio, int cantidad) {
        return precio * cantidad;
    }
    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;
        int valorTotal= calculadorasubtotal(precio, cantidad);
        System.out.println("El valor total del inventario es: " + valorTotal);
    }
}
