public class ComprovanteMatriculaChile implements ComprovanteMatricula {
    private final String nomeAluno;

    public ComprovanteMatriculaChile(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String descricao() {
        return "Alumno: " + nomeAluno + " (RUT)";
    }
}
