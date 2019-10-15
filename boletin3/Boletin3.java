
package boletin3;
//@author irodriguezsteuerberg

public class Boletin3 {

    public static void main(String[] args) {
    //Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
    Consumo obxConsumo1 = new Consumo();   
    obxConsumo1.amosar();
    obxConsumo1.setKms(50);
    obxConsumo1.setPGas(1.57f);
    obxConsumo1.amosar();
    Consumo obxConsumo2 = new Consumo(30,50,90.4f,7.3f);
    float valor = obxConsumo2.consumoMedio();
    System.out.println("consumo medio ="+valor);
    obxConsumo2.setLitros(25);
    float valor2 = obxConsumo2.getVMed();
    System.out.println("A velocidade media é de "+valor2);
    
} 
}
