import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe  objeto        Construtor
        Turista mochileiro = new Turista("Maia")
                ;
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");
        // Atribuicao indireta
        String nome = JOptionPane.showInputDialog("Entre com seu nome:");
        mochileira.setNome(nome);

        // Fazer o mesmo para capturar o cpf
        String cpf = JOptionPane.showInputDialog("Entre com seu cpf:");
        mochileira.setCpf(cpf);

        // Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome dessa turista é: " + outroTurista.getNome());
        // Fazer o recebimento do cpf para este turista
        if(Validacao.cpf(cpf))
            outroTurista.setCpf(cpf);

        else
            System.out.println("CPF inválido!");
        System.out.println("O cpf do objeto é :"+cpf);

    }
}