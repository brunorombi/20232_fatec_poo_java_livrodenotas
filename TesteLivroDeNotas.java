public class TesteLivroDeNotas {
    static public void main (String args []){

        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("digite o nome da disciplina: ");
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        livroDeNotas.exibirMensagem();
        //livroDeNotas.nomeDisciplina = "portugues";
        getNomeDisciplina();
        String nome = "ABC";
        System.out.println("Até logo");
        livroDeNotas.setNomeDisciplina("portugues");
    }
}