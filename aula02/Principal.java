public class Principal{
    public static void main(String[] args){

        //imprimir dados dos objetos
        No<String> obj1 = new No<String>("Toruh");
        System.out.println(obj1.imprimeDado());
          
    
        No<String> obj2 = new No<String>("Vivi");
        System.out.println(obj2.imprimeDado());

        No<String> obj3 = new No<String>("Safira");
        System.out.println(obj3.imprimeDado());

        //imprimir dados da lista dos objetos
        obj1.setAux(obj2);
        obj2.setAux(obj3);

        System.out.println(obj1.imprimeDado());
        System.out.println(obj1.getAux().imprimeDado());
        System.out.println(obj1.getAux().getAux().imprimeDado());

        //No<Integer> obj2 = new No<Integer>(32);
        //System.out.println(obj2.imprimeDado());
    }


}