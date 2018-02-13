package org.test.dp.behavioral.mediator.test;

import org.test.dp.behavioral.mediator.model.AirIndia;
import org.test.dp.behavioral.mediator.model.AirTrafficController;
import org.test.dp.behavioral.mediator.model.AirTrafficControllerImpl;
import org.test.dp.behavioral.mediator.model.Eithad;
import org.test.dp.behavioral.mediator.model.Flight;
import org.test.dp.behavioral.mediator.model.KingFisher;
import org.test.dp.behavioral.mediator.model.SpiceJet;

public class MediatorPatternTester
{
    public static void main(String[] args)
    {
        final AirTrafficController controller = new AirTrafficControllerImpl();
        
        final Flight sj = new SpiceJet(controller);
        final Flight kf = new KingFisher(controller);
        final Flight ai = new AirIndia(controller);
        final Flight et = new Eithad(controller);
        
        controller.registerFlight(sj);
        controller.registerFlight(kf);
        controller.registerFlight(ai);
        controller.registerFlight(et);
        
        sj.send(sj.name() + " landing in terminal xxx in 5 mins");
    }
}
