package heranca;

public class Automovel extends Terrestre {
    private String numPlaca;
    private int numPortas;
    
    public void ImprimeDadosCarro(){
        
        System.out.println(numPlaca+ " - Placa\n"
                        + numPortas +" - Número de portas\n"
                        +numRodas+" - Número de rodas\n"
                        +capacidade+" - Capacidade");
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
}
