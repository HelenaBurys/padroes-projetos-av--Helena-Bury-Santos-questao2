
public class Matricula {
    private final String nomeAluno;
    private final FabricaArtefatosMatricula fabrica;

    public Matricula(String nomeAluno, FabricaArtefatosMatricula fabrica) {
        if (nomeAluno == null || nomeAluno.isBlank()) {
            throw new IllegalArgumentException("Nome do aluno é obrigatório.");
        }
        if (fabrica == null) {
            throw new IllegalArgumentException("Fábrica de artefatos é obrigatória.");
        }
        this.nomeAluno = nomeAluno;
        this.fabrica = fabrica;
    }

    public void confirmar() {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal();
        ProcessamentoPagamento pagamento = fabrica.criarProcessamentoPagamento();
        ComprovanteMatricula comprovante = fabrica.criarComprovanteMatricula(nomeAluno);

        System.out.printf(
                "Relatório da matrícula de %s%nDocumento fiscal: %s%nPagamento: %s%nComprovante: %s%n%n", nomeAluno,documentoFiscal.descricao(),pagamento.descricao(),comprovante.descricao()
        );
    }
}
