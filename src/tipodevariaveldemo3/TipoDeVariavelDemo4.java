package tipodevariaveldemo3;

public class TipoDeVariavelDemo4 {

    public static void main(String[] args) {
        float peso = 85F;
        float alturaEmMetros = 1.64F;

        float imc = peso / (alturaEmMetros * alturaEmMetros);
        System.out.println("O seu IMC é de " + imc + ".");
    }

}
