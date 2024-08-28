public class Fila<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("fila");
    }

    public Fila(String nomeFila){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeFila = nomeFila;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }




}