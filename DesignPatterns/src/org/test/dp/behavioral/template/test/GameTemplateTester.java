package org.test.dp.behavioral.template.test;

import org.test.dp.behavioral.template.model.COD;
import org.test.dp.behavioral.template.model.FIFA;
import org.test.dp.behavioral.template.model.GameTemplate;

public class GameTemplateTester
{
    public static void main(String[] args)
    {
        final GameTemplate cod = new COD();
        cod.playGame();
        System.out.println();
        final GameTemplate fifa = new FIFA();
        fifa.playGame();
    }
}
