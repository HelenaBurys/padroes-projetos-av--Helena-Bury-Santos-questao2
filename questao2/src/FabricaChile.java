
public class FabricaChile implements FabricaArtefatosMatricula {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalChile();
    }

    @Override
    public ProcessamentoPagamento criarProcessamentoPagamento() {
        return new PagamentoWebpay();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula(String nomeAluno) {
        return new ComprovanteMatriculaChile(nomeAluno);
    }
}
