package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    //
    //    drawPentagon (recipe below) --#10.1
    //
    drawPentagon();
  }
  private static void drawPentagon()
  {
    //    ------------- Recipe for drawPentagon --#10.2
    for (int i = 0; i < 200; i++)
    {
      //        adjustPen (recipe below) --#9.1
      //
      //        ------------- Recipe for adjustPen --#9.2
      //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
      Tortoise.setPenColor(ColorWheel.getNextColor());
      //        Increase the tortoises pen width by 1 --#15                                              
      //        If the tortoise's pen width is greater than 4, then --#17
      //            Reset the pen width to 1 --#16
      //        ------------- End of adjustPen recipe --#9.3 
      //
      int Length = i;
      Tortoise.move(Length);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
    //    ------------- End of drawPentagon recipe --#10.3
  }
  private static void createColorPalette()
  {
    //    ------------- Recipe for createColorPalette --#8.2
    ColorWheel.addColor(Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    //    Add dark slate blue to the color wheel --#12
    //    Add teal to the color wheel --#13
    //    Add indigo to the color wheel --#14
    //    ------------- End of createColorPalette recipe --#8.3
  }
}
