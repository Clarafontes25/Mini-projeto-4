import java.util.Scanner; 

public class Capitulo{

    String nome;
    String texto;
    String []escolhas;
    Personagem perso;
    int alterarEnergia;
    Scanner input;

    Capitulo(String nome, 
             String texto, 
             String[] escolhas,
             Personagem perso, 
             int alterarEnergia, 
             Scanner input){

        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.perso = perso;
        this.alterarEnergia = alterarEnergia;
        this.input = input;
    }
    void mostrar(){
        System.out.println(this.texto);
        System.out.println();
         if(this.escolhas!=null){
         for(String idEscolha:escolhas){
             System.out.println(idEscolha);
        }
         }
        System.out.println();
        this.perso.alterarEnergia(this.alterarEnergia);
        System.out.println();
        }
        int escolher(){
        int idEscolha=0;
        String receba=input.nextLine();
         for(int i = 0; i<escolhas.length;i++){
          if (receba.equals(escolhas[i])){
        idEscolha=i;
        }
        }
        return idEscolha;
        }
        }
        
        
