
package boletin3;
// @author irodriguezsteuerberg

public class Consumo {
//parametros
 private float km; 
 private float litros;
 private float vMed;
 private float pGas;        

//constructores
public Consumo(){
}
public Consumo(float k,float l,float vM,float pG){
km = k;
litros = l;
vMed = vM;
pGas = pG;
}

public void amosar(){
System.out.println("KM:"+km+", litros:"+litros+", vMed:"+vMed+", pGas:"+pGas);
}

public void setKms(float k){
km = k;
}
public void setLitros(float l){
litros = l;    
}
public void setvMed(float vM){
vMed = vM;
}
public void setPGas(float pG){
pGas = pG;
}
public float getKms(){
return km;
}
public float getLitros(){
return litros;
}
public float getVMed(){
return vMed;
}
public float getPGas(){
return pGas;
}
public float getTempo(){
return km*vMed;
} 
public float consumoMedio(){
float consumoM = (litros/km)*100;
return consumoM;
}
public float consumoEuros(){
float consumoE = ((litros/km)*100)*pGas;
return consumoE;
}





}