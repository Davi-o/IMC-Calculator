package model;

/**
 *
 * @author Davi Alves
 * @since 25/03
 * @version 1.0
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private int altura;
    private double peso;
    private double percentGordura;
    
    public Pessoa() { }
        
    /**
     * 
     * @param nome define o valor de nome
     * @param idade define o valor de sexo
     * @param idade define o valor de idade
     * @param altura define o valor de altura
     * @param peso define o valor de peso
     */
    public Pessoa(String nome, String sexo, int idade, int altura, double peso, double percentGordura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.percentGordura = percentGordura;
    }
    
    // getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPercentGordura() {
        return percentGordura;
    }

    public void setPercentGordura(double percentGordura) {
        this.percentGordura = percentGordura;
    }    
    // setters
    
    /**
     * @return retorna os calculos de imc, tanto o antigo quanto o da usp
     */
    private String calcularIMC(){
        double altura= 1.0 * this.altura;//converte o valor de altura de int para double
        double antigoIMC = this.peso/(altura*altura);
        double novoIMC = ((3 * this.peso) + (4 * this.percentGordura)) / this.altura;
        return "Antigo IMC: "+ String.valueOf(antigoIMC)+"\n"+
               "Novo IMC: "+ String.valueOf(novoIMC);
    }
    
    /**
     * @return calcula a diferença entre o peso ideal da pessoa pelo seu peso atual
     */
    private String calcularSobrePeso(){
        double calculo= this.peso - (this.altura - 100);
        return String.valueOf(calculo);
    }
    
    /**
     * @return concatena os metodos privados calcularIMC e calcularSobrePeso para serem exibidos ao usuario
     */
    public String mostrarResultados(){
        return "\nVocê está aproximadamente " + calcularSobrePeso()+"Kg de diferença do seu peso ideal.\n"+
                calcularIMC();
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSexo: " + this.sexo + "\nIdade: " + this.idade +" anos"+ "\nAltura: " + this.altura + "\nPeso atual: " + this.peso + mostrarResultados();
    }

    
        
}
