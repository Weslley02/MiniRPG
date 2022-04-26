class Main {
  public static void main(String[] args) {
    
    Arma plasma = new Arma(0, 30);
    Player player = new Player("Paulo", 100, 0f, 0f, 10, plasma);
    Monstro alien = new Monstro();
    alien.nome = "Alien";
    alien.forca = 40;
    alien.pontosDeVida = 400;

    int danoDoPlayer = player.causarDano();
    while(alien.pontosDeVida > 0){
      alien.receberDano(danoDoPlayer);
      System.out.println("Vida do monstro: " + alien.pontosDeVida);
    }
  }
}