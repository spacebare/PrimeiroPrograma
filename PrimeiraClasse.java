public class PrimeiraClasse {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        PrimeiraClasse p = (PrimeiraClasse) obj;

        if(this.nome.equals(p.nome)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Classe Teste";
    }
}
