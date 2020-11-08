/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradesin.dto;

/**
 *
 * @author alvaropp
 */
public class Calculadora {
    
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    
    public Calculadora(){
        cadena="";
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
    }
    
    
public String concatenar(String cadena){
    this.cadena=this.cadena+cadena;
    return this.cadena;
}

public void sumar(String cadena){
    this.resultado=Double.parseDouble(cadena);
    suma=true;
    this.cadena="";
}

public void restar(String cadena){
    this.resultado=Double.parseDouble(cadena);
    resta=true;
    this.cadena="";
}

public void multiplicar(String cadena){
    this.resultado=Double.parseDouble(cadena);
    multiplicacion=true;
    this.cadena="";
}

public void division(String cadena){
    this.resultado=Double.parseDouble(cadena);
    division=true;
    this.cadena="";
}

public double resultado(String numero){
    if(suma==true){
        resultado=resultado+Double.parseDouble(numero);
    }else if(resta==true){
        resultado=resultado-Double.parseDouble(numero);
    }else if(multiplicacion==true){
        resultado=resultado*Double.parseDouble(numero);
    }else if(division==true){
        resultado=resultado/Double.parseDouble(numero);
    }
    
    suma=false;
    resta=false;
    multiplicacion=false;
    division=false;
    return resultado;
}
    
    
    
}
