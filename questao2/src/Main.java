
public class Main {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula("Kaue de Jesus", new FabricaBrasil());
        matriculaBrasil.confirmar();

        Matricula matriculaChile = new Matricula("Helena Bury Santos", new FabricaChile());
        matriculaChile.confirmar();
    }
}
