
public interface FabricaArtefatosMatricula {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessamentoPagamento criarProcessamentoPagamento();
    ComprovanteMatricula criarComprovanteMatricula(String nomeAluno);
}
