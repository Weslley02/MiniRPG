class Player {

  Arma arma;
  int forca;
  float posicaoX;
  float posicaoY;
  int pontosDeVida;
  String nome;

  //Construtor
  Player(String n, int ptsDeVida, float posInicialX, float posInicialY, int forca, Arma novaArma){
    System.out.println("Construtor do player");
    nome = n;
    pontosDeVida = ptsDeVida;
    posicaoX = posInicialX;
    posicaoY = posInicialY;
    this.forca = forca;
    arma = novaArma;
  }

  void mover(float posX, float posY){
    posicaoX = posicaoX + 5;
    posicaoY = posicaoY + 5;
  }

  float exibirPosicaoX(){
    return posicaoX;
  }

  float exibirPosicaoY(){
    return posicaoY;
  }

  void receberDano(int dano){
    pontosDeVida = pontosDeVida - dano;
  }

  int exibirPtsDeVida(){
    return pontosDeVida;
  }

  String exibirStatus(){
    String status = "Nome: " + nome + " Vida:  " + pontosDeVida;
    return status;
  }

  int causarDano(){
    if(arma != null){
      return forca + arma.retornaDanoDaArma();
    } 
    return forca;
  }
}