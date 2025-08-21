public class ProjetoLivraria {
    public static void main(string[] args) {
        //instancia de dois objetos do tipo Livro
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        //alteração dos atributos dos objetos
    livro1.titulo = "Vermelho, branco e sangue azul";
    livro1.autor = "Casey McQuiston";
    livro1.preco = 50.00;

    livro2.titulo = "Coraline";
    livro2.autor = "Neil Gaiman";
    livro2.preco = 70.00;

        //impressão dos atributos dos objetos
    System.out.println("Livro 1: ")
    System.out.println("titulo: " + livro1.titulo);
    System.out.println("autor: " + livro1.autor);
    System.out.println("preco: R$ " + livro1.preco)

    System.out.println("Livro 2: ")
    System.out.println("titulo: " + livro2.titulo);
    System.out.println("autor: " + livro2.autor);
    System.out.println("preco: R$ " + livro2.preco)
    }
}
