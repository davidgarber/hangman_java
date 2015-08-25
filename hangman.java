public class Hangman {

  public static void main(String[] args) {

      Game game = new Game("treehouse");
      Prompter prompter = new Prompter(game);
      boolean isHit = prompter.promptForGuess();
  }
}
