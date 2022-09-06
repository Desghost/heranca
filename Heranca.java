package heranca;

public class Heranca {

    
    public static void main(String[] args) {
       
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("GRO-9565");
        carro.setNumPortas(3);
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        
        carro.ImprimeDadosCarro();
        
    }
    
}
