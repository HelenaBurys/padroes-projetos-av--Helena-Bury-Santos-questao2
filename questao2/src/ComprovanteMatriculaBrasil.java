public class ComprovanteMatriculaBrasil implements ComprovanteMatricula {
    private final String nomeAluno;

    public ComprovanteMatriculaBrasil(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String descricao() {
        return "Aluno: " + nomeAluno + " (CPF)";
    }
}
