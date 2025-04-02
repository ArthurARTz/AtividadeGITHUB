import javax.swing.JOptionPane;

public class Atividadejavagit {
    public static void main(String[] args) {

        String salarioStr = JOptionPane.showInputDialog("Digite o salário :");
        double salario = Double.parseDouble(salarioStr);

        double porcaumento;

        // Aqui vai ser feito a análise de condição, o salário vai ser comparado e dependendo do valor, vai ser atribuído a porcentagem correspondente à variável poraumento.
        if (salario <= 280) {
            porcaumento = 20;
        } else if (salario <= 700) {
            porcaumento = 15;
        } else if (salario <= 1500) {
            porcaumento = 10;
        } else {
            porcaumento = 5;
        }

        // Aqui vai calcular o valor do aumento e posteriormente vai soma-lo ao salário inicial.
        double valorAumento = (porcaumento / 100) * salario;
        double novoSalario = salario + valorAumento;

        // Aqui pós reajuste di salário, vai ser multiplicado pela inflação, para saber o valor real de aumento do salário.
        double aumcinfla = valorAumento - ((3.8 / 100) * salario);

        // Aqui, como optei por utilizar o Joption pane para receber o salário do usuário, aproveitei para mostrar a mensagem final ao usuário por esta função também.
        String mensagem =   "Resumo do Reajuste Salarial:\n" +
                "Salário antes do reajuste: R$" + salario + "\n" +
                "Percentual de aumento aplicado: " + porcaumento + "%\n" +
                "Valor do aumento: R$" + valorAumento + "\n" +
                "Novo salário após aumento: R$" + novoSalario + "\n" +
                "Valor do aumento real (descontando inflação): R$" + aumcinfla;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
