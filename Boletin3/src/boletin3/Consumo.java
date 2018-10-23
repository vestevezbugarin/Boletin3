package boletin3;

public class Consumo {

    private float km;       //kilómetros percorridos polo coche
    private float litros;   //Litros de combustible consumidos
    private float vMed;     //velocidade media
    private float pGas;     //Prezo da gasolina
    private float tempo;     //tempo percorrido

    public Consumo() {
    }

    public Consumo(float km, float litros, float vMed, float pGas, float tempo) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
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

    public float getvMed() {
        return vMed;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public float getpGas() {
        return pGas;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
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
        float gasto = consumoMedio() * pGas;
        return gasto;
    }

    public float velocidadeMedia() {

        float velMedia = this.km / this.tempo;
        return velMedia;
    }
}
