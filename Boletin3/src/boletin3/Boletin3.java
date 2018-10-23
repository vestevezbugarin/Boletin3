package boletin3;

public class Boletin3 {

//    a) Crea un obxecto, de tipo consumo, utilizando o constructor sen parámetros
//    b) Dalle a litros o valor 50 e a prezo da gasolina 1.57
//    c) Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
//    d) Visualiza, a  través do 2º obxecto, o consumo medio
//    e) Varia o valor dos litros consumidos do 2º obxecto.
//    f) Visualiza a velocidade media do 2º obxecto
    public static void main(String[] args) {

        //A
        Consumo consumo1 = new Consumo();

        //B
        consumo1.setLitros(50f);
        consumo1.setPrecioCombustible(1.57f);

        //C
        Consumo consumo2 = new Consumo(50f, 5f, 100f, 1.39f, 1f);

        //D
        System.out.println("O consumo Medio é: " + consumo2.consumoMedio() + " l/100Km");
        System.out.println("O consumo en Euros é: " + consumo2.consumoEuros() + " €");

        //E
        consumo2.setLitros(10f);

        System.out.println("\nO consumo Medio agora é: " + consumo2.consumoMedio() + " l/100Km");
        System.out.println("O consumo en Euro agora é: " + consumo2.consumoEuros() + " €");

        //F
        System.out.println("A velocidade media foi: " + consumo2.getVelocidadeMedia() + " Km/h");
        System.out.println("A velocidade media foi: " + consumo2.velocidadeMedia() + " Km/h");

    }

}
