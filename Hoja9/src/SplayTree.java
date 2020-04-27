

public class SplayTree<E extends Comparable<E>> {
    private Nodo<E> raiz;

    public SplayTree(){
        raiz = null;
    }

    public boolean isEmpty(){
        return raiz == null;
    }

    public Nodo<E> getRaiz(){
        return raiz;
    }

    public void setRaiz(Nodo<E> raiz){
        this.raiz = raiz;
    }

    public void addNodo(Nodo node,Nodo raiz){
        if (raiz == null){
            this.setRaiz(node);
        }else {
            if (node.getAssociation().getKey().compareTo(raiz.getAssociation().getKey()) < 0){
                if (raiz.getLeft() == null){
                    raiz.setLeft(node);
                }else {
                    addNodo(node,raiz.getLeft());
                }
            }else{
                if (raiz.getRight() ==null){
                    raiz.setRight(node);
                }else{
                    addNodo(node, raiz.getRight());
                }
            }
        }
    }

    public void rotateLeft(Nodo c, Nodo p){
        if ((c ==null)||(p == null) ||(p.parent !=c)||(c.parent != p)){
            throw new RuntimeException("Error");
        }

        if (p.parent != null){
            if (p ==p.parent.left){
                p.parent.left = c;
            }else{
                p.parent.right = c;
            }
        }if (c.right != null){
            c.right.parent = p;
        }

        c.parent = p.parent;
        p.parent = c;
        p.left = c.right;
        c.right = p;
    }

    public void rotateRight(Nodo c, Nodo p){
        if ((c ==null)||(p == null) ||(p.right !=c)||(c.parent != p)){
            throw new RuntimeException("Error");
        }

        if (p.parent != null){
            if (p ==p.parent.left){
                p.parent.left = c;
            }else{
                p.parent.right = c;
            }
        }if (c.left != null){
            c.left.parent = p;
        }

        c.parent = p.parent;
        p.parent = c;
        p.right = c.left;
        c.left = p;
    }

    private void Splay(Nodo x){
        while (x.parent != null){
            Nodo parent = x.parent;
            Nodo grandparent = parent.parent;
            if (grandparent == null){
                if (x == parent.left){
                    rotateLeft(x,parent);
                }else{
                    rotateRight(x,parent);
                }
            }else{
                if(x == parent.left){
                    if (parent == grandparent.left){
                        rotateLeft(parent,grandparent);
                        rotateLeft(x,parent);
                    }else{
                        rotateLeft(x,x.parent);
                        rotateRight(x,x.parent);
                    }
                }else {
                    if(parent == grandparent.left){
                        rotateRight(x,x.parent);
                        rotateLeft(x,x.parent);
                    }else {
                        rotateRight(parent,grandparent);
                        rotateRight(x,parent);
                    }
                }
            }
        }
        raiz = x;
    }

    public String buscar(String palabra){
        if (raiz == null){
            return "*" + palabra + "*";
        }else {
            return raiz.search(palabra);
        }
    }

}
