import javax.swing.JOptionPane;

public class Atividadejavalaco {
    public static void main(String[] args) {

        while (true) {
            String salarioStr = JOptionPane.showInputDialog("Digite o salário (ou clique Cancelar para sair):");


            if (salarioStr == null || salarioStr.trim().isEmpty()) {
                break;
            }

            double salario = Double.parseDouble(salarioStr);
            double porcaumento;

            if (salario <= 280) {
                porcaumento = 20;
            } else if (salario <= 700) {
                porcaumento = 15;
            } else if (salario <= 1500) {
                porcaumento = 10;
            } else {
                porcaumento = 5;
            }

            double valorAumento = (porcaumento / 100) * salario;
            double novoSalario = salario + valorAumento;
            double aumcinfla = valorAumento - ((3.8 / 100) * salario);

            String mensagem = "Resumo do Reajuste Salarial:\n" +
                    "Salário antes do reajuste: R$" + salario + "\n" +
                    "Percentual de aumento aplicado: " + porcaumento + "%\n" +
                    "Valor do aumento: R$" + valorAumento + "\n" +
                    "Novo salário após aumento: R$" + novoSalario + "\n" +
                    "Valor do aumento real (descontando inflação): R$" + aumcinfla;

            JOptionPane.showMessageDialog(null, mensagem);
        }

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }
}
