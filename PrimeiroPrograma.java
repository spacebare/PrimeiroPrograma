public class PrimeiroPrograma {

    public static void main(String argumentos[]){

        PrimeiraClasse classe1 = new PrimeiraClasse();
        classe1.setNome("Samuelson");

        PrimeiraClasse classe2 = new PrimeiraClasse();
        classe2.setNome("Samuelson");

        if(classe1.equals(classe2)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        System.out.println(classe1);
        System.out.println(classe2);
        

    }
}