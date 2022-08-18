
package memorias;

public class memoriasimple{
    private int totalRegistros;
    private int[] datos;

    public memoriasimple(int total) {
        int i;
        
         this.totalRegistros=total;
         this.datos=new int[this.totalRegistros];
         for(i=0; i<this.totalRegistros; i++){
             datos[i]=0;
         }
    }
    

    public int lectura(int direccion){
        return datos[direccion];
    }
    
    public void escritura(int direccion, int valor){
        datos[direccion]=valor;
    }
}
