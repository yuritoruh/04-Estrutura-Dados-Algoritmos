public class Principal{
    public static void man(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Toruh");
        lista.imprimeDado();
        lista.addInicio("Vivi");
        lista.imprimeDado();
        lista.addFinal("Safira");
        lista.imprimeDado();

    }
}

