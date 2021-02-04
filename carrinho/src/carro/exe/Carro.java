package carro.exe;

import java.time.LocalDate;

public class Carro {
     private String modelo;
     private String cor;
     private LocalDate ano;
     private Integer chassi;
     private proprietario proprietario;
     private Integer velocidadeMaxima;
     private Integer velocidadeAtual;
     private Integer numeroPortas;
     private Integer numeroMarchas;
     private Double quantidadeCombustivel;
     private Double mediaLitro;


    public Carro(Double quantidadeCombustivel,
               carro.exe.proprietario proprietario){
      this.quantidadeCombustivel = quantidadeCombustivel;
      this.proprietario = proprietario;
  }

    public void acelera(){
      if(velocidadeAtual < velocidadeMaxima){
        this.velocidadeAtual += 1;
      }else{
          System.out.println("Voce está na velocidade máxima");}
    }

    public void freia(){
      if(velocidadeAtual > 0 ){
          this.velocidadeAtual = 0;
      }else{
          System.out.println("O carro já está parado");}
    }

    public void trocaMarcha(){
      if(numeroMarchas < 6){
         this.numeroMarchas += 1;
      }else{
          System.out.println("O carro está em sua marcha máxima(6)");}
    }

    public void reduzMarcha(){
      if (numeroMarchas > 0){
          this.numeroMarchas -= 1;
      }else{
          System.out.println("O carro está na marcha mínima (0) ");}
    }

    public Double media(Double quantidadeCombustivel, Double mediaLitro){
      this.quantidadeCombustivel * this.mediaLitro
              return Double;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public Integer getChassi() {
        return chassi;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    public carro.exe.proprietario getProprietari() {
        return proprietario;
    }

    public void setProprietari(carro.exe.proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(Integer numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public Double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Double getMediaLitro() {
        return mediaLitro;
    }

    public void setMediaLitro(Double mediaLitro) {
        this.mediaLitro = mediaLitro;
    }
}
