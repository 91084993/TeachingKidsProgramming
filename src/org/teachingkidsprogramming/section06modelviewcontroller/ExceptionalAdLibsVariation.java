package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
    String askForBodyPart = askForBodyPart();
  } // end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Try again.");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs, try again");
      askAdverb();
    }
    return adverb;
  } // end of the method
  private static String askEdverb()
  {
    String edVerb = MessageBox.askForTextInput("Enter a verb ending in -ed: ");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Don't like verbs? You need one now.");
      askEdverb();
    }
    else if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers != are not edVerb");
    }
    return edVerb;
  }
  private static String askForBodyPart()
  {
    String askForBodyPart = MessageBox.askForTextInput("Enter a body part: ");
    if (askForBodyPart.isEmpty())
    {
      MessageBox.showMessage("Try again");
    }
    return askForBodyPart;
  }
} // end of class
