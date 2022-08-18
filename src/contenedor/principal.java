
package contenedor;

public class principal {
    
    public static memorias.memoriasimple memoria;
    public static void main(String[] args) {
        int salida;
        memoria=new memorias.memoriasimple(20);
        memoria.escritura(15,555);
        salida=memoria.lectura(15);
        
        System.out.println(salida);
    }
    
}
