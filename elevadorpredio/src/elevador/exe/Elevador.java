package elevador.exe;

public class Elevador {
    Integer andares;
    Integer pessoas;
    Integer ultimoAndar;
    Integer capacidadeMax;

    public Elevador(Integer pessoas, Integer andares, Integer capacidadeMax, Integer ultimoAndar){
        this.pessoas = pessoas;
        this. andares = andares;
        this.capacidadeMax = 15;
        this.ultimoAndar = 13;
    }
    public void subir(){
        if(this.andares >= ultimoAndar){
            System.out.println("Você está no ultimo andar");
        }else{ this.andares = this.andares +1;}
    }
    public void descer(){
        if(this.andares == 0){
            System.out.println("Voce está no térreo");
        }else{ this.andares = this.andares -1;}
    }

    public void entra(){
        if(this.pessoas == capacidadeMax){
            System.out.println("O elevador está cheio");
        }else{ this.pessoas = this.pessoas +1;}
    }

    public void sai(){
        if(this.pessoas == 0 ){
            System.out.println("O elevador está vazio");
        }else{ this.pessoas = this.pessoas -1;}

    }
}
