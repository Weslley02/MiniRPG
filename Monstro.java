class Monstro {

  String nome;
  int forca;
  int pontosDeVida;

  int causarDano(){
    return forca * 3;
  }

  String grunhir(){
    return "Uowwwowwwww!";
  }

  void receberDano(int dano){
    pontosDeVida -= dano;
    
    if(pontosDeVida <= 0){
      morrer();
    }
  }

  void morrer(){
    System.out.println("O monstro morreu.");
  }
}