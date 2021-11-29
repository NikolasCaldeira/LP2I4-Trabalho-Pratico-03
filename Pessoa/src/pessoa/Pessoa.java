    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author Nikol
 */
public class Pessoa {
    
    public static int kp = 0;
    private String nome;
    private char sexo;
    private int idade;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, char sexo, int idade){
        kp++;
        this.nome = nome;
        this.sexo = Character.toUpperCase(sexo);
        this.idade = idade;
    }
    
    
     public void setKp(int kp){
         Pessoa.kp = kp++;
     }
     
     public void setNome(String nome){
         this.nome = nome;
     }
     
     public void setSexo(char sexo){
         this.sexo = sexo;
     }
     
     public void setIdade(int idade){
         this.idade = idade;
     }
     
     public int getKp(){
         return kp;
     }
     
     public String getNome(){
         return nome;
     }
     
     public char getSexo(){
         return sexo;
     }
     
     public int getIdade(){
         return idade;
     }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
