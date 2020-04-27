/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19822
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */

public class Nodo<E> {
    Association<String, String> value;
    Nodo<E> parent;
    Nodo<E> left;
    Nodo<E> right;

    public Nodo(String Ing, String Esp) {
        value = new Association<>(Ing, Esp);
        parent = null;
        left = null;
        right = null;
    }

    public Nodo(String Ing,String Esp, Nodo<E> ni, Nodo<E> nd){
        value = new Association<>(Ing,Esp);
        if(ni != null) left = ni;
        if(nd != null) right = nd;
    }

    public Nodo(String Ing, String Esp,String IngLeft,String EspLeft ,String IngRight, String EspRight){
        value = new Association<>(Ing,Esp);
        if (IngLeft != null && EspLeft != null){
            left = new Nodo<>(IngLeft,EspLeft);
        }
        if (IngRight != null && EspRight != null){
            right = new Nodo<>(IngRight,EspRight);
        }
    }

    /**
     * getEspaniol
     * @return
     */
    public String getEspanol(){
        return value.getValue();
    }

    /**
     * getIngles
     * @return
     */
    public String getIngles(){
        return value.getKey();
    }

    /**
     * getAssociation
     * @return
     */
    public Association getAssociation(){
        return value;
    }

    /**
     * izquierdo
     * @return
     */
    public Nodo getLeft(){
        return left;
    }

    /**
     * Derecho
     * @return
     */
    public Nodo getRight(){
        return  right;
    }

    /**
     * definir izquierdo
     * @param left
     */
    public void setLeft(Nodo left){
        this.left = left;
    }

    /**
     * Definir derecho
     * @param right
     */
    public void setRight(Nodo right){
        this.right = right;
    }

    /**
     * Buscar
     * @param value
     * @return
     */
    public String search(String value){
        if (value.equals(this.value.getKey())){
            return this.value.theValue;
        }else if(value.compareTo(this.value.getKey())< 0){
            if (left == null){
                return "*" + value + "*";
            }else {
                return left.search(value);
            }
        }else if (value.compareTo(this.value.getKey())> 0){
            if (right == null){
                return "*" + value + "*";
            }
        }else{
            return right.search(value);
        }
        return "*"+ value + "*";
    }
}