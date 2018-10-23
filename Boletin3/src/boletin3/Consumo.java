package boletin3;

public class Consumo {

    private float km;       //kilómetros percorridos polo coche
    private float litros;   //Litros de combustible consumidos
    private float velocidadeMedia;     //velocidade media
    private float precioCombustible;     //Prezo da gasolina
    private float tempo;     //tempo percorrido

    public Consumo() {
    }

    public Consumo(float km, float litros, float vMed, float pGas, float tempo) {
        this.km = km;
        this.litros = litros;
        this.velocidadeMedia = vMed;
        this.precioCombustible = pGas;
        this.tempo = tempo;
    }
    //Getters & setters

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public float getPrecioCombustible() {
        return precioCombustible;
    }

    public void setPrecioCombustible(float precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    public float getTempo() {

        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    //Methods
    public float consumoMedio() {
        float consumoM = this.litros * 100 / this.km;
        return consumoM;
    }

    public float consumoEuros() {
        float gasto = consumoMedio() * precioCombustible;
        return gasto;
    }

    public float velocidadeMedia() {

        float velMedia = this.km / this.tempo;
        return velMedia;
    }
}
