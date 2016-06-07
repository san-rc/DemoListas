package Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author san rc
 */
public class ClassListaDeAspirantes {//si esta vacia, agregar, si esta vacia, si esta llena la lista.
    //clases coleciones de java
    private List<ClassAspirante> aspirantes;//esta en casulando esta lista

    public ClassListaDeAspirantes() {
        aspirantes = new ArrayList<>();
    }
    public boolean add(ClassAspirante aspirante){
        return aspirantes.add(aspirante);
    }
    public boolean remove(ClassAspirante aspirante){
        return aspirantes.remove(aspirante);
    }
    public int size(){
        return aspirantes.size();
    }
    public boolean isEmpty(){
        return aspirantes.isEmpty();
    }
    public ClassAspirante get(int posicion){
        return aspirantes.get(posicion);
    }
    public static void main(String[] args) {
        ClassListaDeAspirantes Lista = new ClassListaDeAspirantes();
        Lista.add(new ClassAspirante("juanita"));
        Lista.add(new ClassAspirante("jorge"));
        Lista.add(new ClassAspirante("juan"));
        Lista.add(new ClassAspirante("julian"));
        
        for (int i = 0; i <Lista.size(); i++) {
            ClassAspirante aspirante = Lista.get(i);
            System.out.println("Aspirante: " + aspirante.getNombreAspirante());
            System.out.println("Aceptados: " +
                    (aspirante.isAceptado() ? "SI" : "NO"));
            //antes del signo arroja falso o verdadero
            //operador ternario ? y los dos puntos : es como un if es una esprecion que 
            //arroja falso o verdadero si vanda verdadero el resulatdo es antes de los dos 
            //puntos y si es falso manda despues de lso dos puntos
        }
    }
}
