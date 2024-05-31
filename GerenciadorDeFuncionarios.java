import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GerenciadorDeFuncionarios {
    
    public static Funcionarios[] funcionarios;
    private Scanner scanner;
    
    
    public GerenciadorDeFuncionarios() {
        
        System.out.println("Digite o número de funcionários a serem cadastrados:");
        scanner = new Scanner(System.in);
        int NumeroDeFuncionarios = scanner.nextInt();
        funcionarios = new Funcionarios[NumeroDeFuncionarios]; // Numero de funcionarios a serem cadastrados
        scanner.nextLine();
    }
    
    public void setFuncionario() {
        for(int i = 0; i < funcionarios.length; i++) {
            Funcionarios funcionario = new Funcionarios();

            System.out.println("Digite o nome do funcionário:");
            funcionario.setNome(scanner.nextLine());

            System.out.println("Digite o cargo do funcionário:");
            funcionario.setCargo(scanner.nextLine());

            System.out.println("Digite a idade do funcionário:");
            funcionario.setIdade(scanner.nextInt());

            System.out.println("Digite o salário do funcionário:");
            funcionario.setSalario(scanner.nextDouble());

            funcionarios[i] = funcionario;

            scanner.nextLine();
        }
    }
    
    public void escreverFuncionariosEmArquivo(String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            for (int i = 0; i < funcionarios.length; i++) {
                Funcionarios funcionario = funcionarios[i];
                if (funcionario != null) {
                    writer.write("Nome: " + funcionario.getNome() + "\n");
                    writer.write("Cargo: " + funcionario.getCargo() + "\n");
                    writer.write("Idade: " + funcionario.getIdade() + "\n");
                    writer.write("Salário: " + funcionario.getSalario() + "\n");
                    writer.write("--------------------\n");
                }
            }
            System.out.println("Dados dos funcionários foram escritos no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
