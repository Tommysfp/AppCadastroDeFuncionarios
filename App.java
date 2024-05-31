
public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorDeFuncionarios gerenciador = new GerenciadorDeFuncionarios();
        gerenciador.setFuncionario();
        gerenciador.escreverFuncionariosEmArquivo("funcionarios.txt");
        
    }
}
