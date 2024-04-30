public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        //Quando for utilizar o for com array sempre começar com 0 pois o array inicia com 0
        /*
        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        */

        //outra forma de interagir sobre elemento de array
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }

}
