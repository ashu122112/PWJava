import java.util.Scanner;

class Guesser {
  int guessNum;

  int guessingNumber() {

    Scanner scan = new Scanner(System.in);
    System.out.println("Guesser! Kindly guess a number");
    guessNum = scan.nextInt();
    return guessNum;
  }

}

class Player {
  int guessNum;

  int guessingNumber() {
    System.out.println("Player! Kindly guess a number");
    Scanner scan = new Scanner(System.in);
    guessNum = scan.nextInt();
    return guessNum;
  }
}

class Umpire {
  int numFromGuesser;
  int numFromPlayer1;
  int numFromPlayer2;
  int numFromPlayer3;

  void collectNumFromGuesser() {
    Guesser g = new Guesser();
    numFromGuesser = g.guessingNumber();

  }

  void collectNumFromPlayer() {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    numFromPlayer1 = p1.guessingNumber();
    numFromPlayer2 = p2.guessingNumber();
    numFromPlayer3 = p3.guessingNumber();

  }

  void compare() {
    if (numFromGuesser == numFromPlayer1) {
      if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
        System.out.println("Sab jeet gaye !");
      }
        else if (numFromGuesser==numFromPlayer2){
          System.out.println("Player1 and player2 won !");
        }
        else if(numFromGuesser==numFromPlayer3){
          System.out.println("Player1 and Player3 won !");
        }
        else {
          System.out.println("Player1 won the game! ");
        }
      }
      
     else if (numFromGuesser == numFromPlayer2) {
      if (numFromGuesser==numFromPlayer3){
        System.out.println("Player 2 and player3 won !");
      }
      else{
            System.out.println("Player2 won the game!");
      }
      
    } else if (numFromGuesser == numFromPlayer3) {
      System.out.println("Player3 won the game! ");
    } else {
      System.out.println("Sab log Haar Gye ... no one won!");
    }
  }

}

public class Launch_Game {
  public static void main(String[] args) {
    System.out.println("Game Started !");
    Umpire u = new Umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayer();
    u.compare();
  }
}
