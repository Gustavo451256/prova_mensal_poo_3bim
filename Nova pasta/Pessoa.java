abstract class Pessoa {
private String nome;
public Pessoa (String nome){
this.nome = nome;    
}
public String getnameString(){
    return nome;
}
abstract void pular();
}
