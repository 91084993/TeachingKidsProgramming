package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class BackgroundPhoto
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    String currPicture = "https://usatftw.files.wordpress.com/2017/05/spongebob.jpg?w=1000&h=600&crop=1";
    Tortoise.getBackgroundWindow().setBackgroundImage(currPicture);
    Tortoise.show();
    Tortoise.setSpeed(10);
    int side = 2;
    //  Do the following 75 times --#7.1
    //     Set the current pen color to yellow --#6.1
    Color currColor = PenColors.Yellows.Yellow;
    Tortoise.setPenColor(currColor);
    //     Use the current pen color for the line the tortoise draws --#6.2
    side++;
    Tortoise.move(side);
    Tortoise.setX(555);
    Tortoise.setY(65);
    Tortoise.turn(360 / 3);
    Tortoise.turn(1);
    //  End Repeat --#7.2
  }
}
