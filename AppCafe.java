package app;

import modelos.CafeBarato;
import modelos.CafeChique;
import modelos.MaquinaCafe;

public class AppCafe {

    public static void main(String[] args) {
        MaquinaCafe maquina1 = new CafeBarato(4);
        MaquinaCafe maquina2 = new CafeChique(5);
        
        System.out.println( maquina1.produzirExpresso(4) );
        System.out.println( maquina1.produzirExpresso(3) );
        System.out.println( maquina1.produzirExpresso(2) );
        System.out.println( maquina1.produzirExpresso(1) );
        System.out.println( maquina1.getPorcoes() );
        System.out.println( maquina1.produzirExpresso(2) );
        System.out.println( maquina1.getPorcoes() );
        System.out.println( maquina1.produzirExpresso(2) );
        
        maquina2.produzirExpresso(10);
    }
    
}
