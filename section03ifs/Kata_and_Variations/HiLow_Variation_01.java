package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_Variation_01
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);;
    int numGuesses = 2;
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 1 and 100?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won the game");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    //    After 8 incorrect guesses tell the user they've lost --#11
  }
}
