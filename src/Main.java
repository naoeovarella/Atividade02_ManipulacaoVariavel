public class Main {

    public static void main(String[] args) {

        // Criação de Variáveis
        String nome = "Silvio"; // Nome da pessoa
        int idade = 19; // Idade da pessoa
        double salarioBrutoMensal = 3500.00; // Salário bruto mensal
        int mesesTrabalhados = 12; // Meses trabalhados no ano
        int quantidadeProdutos = 15; // Quantidade de produtos comprados

        // Atribuição de Valores e Operações Simples
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados; // Salário anual bruto
        double desconto = 200.00; // Valor fixo de desconto
        double salarioAnualLiquido = salarioAnualBruto - desconto; // Salário anual líquido

        double totalGastoProdutos = 4500.00; // Valor total de compras
        double mediaGastoPorProduto = totalGastoProdutos / quantidadeProdutos; // Média de valor gasto por produto

        String mensagem = "Olá " + nome + ", seu salário anual líquido é de R$ " + salarioAnualLiquido; // Mensagem personalizada

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Quantidade de Produtos: " + quantidadeProdutos);
        System.out.println("Média de Gasto por Produto: R$ " + mediaGastoPorProduto);
        System.out.println(mensagem);
    }
}