public class LivroDeNotas{
   private String nomeDisciplina;

   public String getNomeDisciplina(){
    return nomeDisciplina;
   }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n : " ,nomeDisciplina);
    }        
    //construtor padrão (aquele cuja lista de parâmetros é vazia)
    LivroDeNotas(String nomeDisciplina){
       this.nomeDisciplina = nomeDisciplina;
    }
}