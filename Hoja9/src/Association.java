import java.util.Map;

/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19822
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
public class Association<K extends Comparable<K>,V extends Comparable<V>> implements Map.Entry<K,V> {

    protected K theKey;
    protected V theValue;

    /**
     * 
     * @param key
     * @param value
     */
    public Association(K key,V value){
        theKey = key;
        theValue = value;
    }

    /**
     * 
     * @param key
     */
    public Association(K key){
        this(key,null);
    }

    /**
     * Equals
     */
    public boolean equals(Object other){
        Association otherAsso =(Association)other;
        return  getKey().equals(otherAsso.getKey());
    }

    /**
     * hashchode
     */
    public int hashCode (){
        return getKey().hashCode();
    }

    /**
     * retornar un valor
     */
    public V getValue(){
        return theValue;
    }

    /**
     * buscar la llave
     */
    public K getKey(){
        return theKey;
    }

    /**
     * definir un valor
     */
    public V setValue(V value){
        V valueante = theValue;
        theValue = value;
        return valueante;
    }

    /**
     * toString
     */
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }

}
