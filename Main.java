import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Criar a Oficina Mecânica
        OficinaMecanica oficinaMecanica = new OficinaMecanica();
        // Creating a customer
        Cliente cliente = new Cliente("Seu João", "Carro que trabalha na feira");
        oficinaMecanica.registroCliente(cliente);
        // Creating a vehicle for the customer
        Veiculo veiculo = new Veiculo("Toyota", "SRV", 2020, 2020, 50000.0, 75.0);
        oficinaMecanica.registroVeiculo(cliente, veiculo);
        // Creating a work order for maintenance
        OrdemServico ordemServico = oficinaMecanica.criarOrdemServico(cliente, veiculo, "Jair", new Date());
        // Adding parts to the work order
        Peca peca1 = new Peca("P001", "Pedal de freio", 50.0, "Boss", "Unidade");
        Peca peca2 = new Peca("P002", "Filtro de óleo", 10.0, "Pardal", "Unidade");
        oficinaMecanica.addPeca(ordemServico, peca1);
        oficinaMecanica.addPeca(ordemServico, peca2);
        // Adding services to the work order
        Servico servico1 = new Servico("S001", "Troca de óleo", 30.0, 2);
        Servico servico2 = new Servico("S002", "Rodízio de pneus", 20.0, 1);
        oficinaMecanica.addServico(ordemServico, servico1);
        oficinaMecanica.addServico(ordemServico, servico2);
        // Calculating the total value of the work order
        double valorTotal = OficinaMecanica.calcularValorTotal(ordemServico);
        // Displaying the total value
        System.out.println("valor total da Ordem de Servico: R$" + valorTotal);
    }
}