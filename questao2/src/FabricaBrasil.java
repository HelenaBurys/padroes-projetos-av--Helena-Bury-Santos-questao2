
public class FabricaBrasil implements FabricaArtefatosMatricula {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBrasil();
    }

    @Override
    public ProcessamentoPagamento criarProcessamentoPagamento() {
        return new PagamentoPix();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula(String nomeAluno) {
        return new ComprovanteMatriculaBrasil(nomeAluno);
    }
}
