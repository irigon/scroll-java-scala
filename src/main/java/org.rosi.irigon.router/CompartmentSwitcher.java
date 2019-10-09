package org.rosi.irigon.router;

public class CompartmentSwitcher {

    final ScheduledCompartment scheduledCompartment = new ScheduledCompartment();
    final PredictiveCompartment predictiveCompartment = new PredictiveCompartment();
    final NaiveCompartment naiveCompartment = new NaiveCompartment();

    public AbstractCompartment activate(AbstractRouter ar, String ctxt) {
        switch (ctxt){
            case "scheduled_ctxt" :
                return scheduledCompartment;
            case "predictive_ctxt" :
                return predictiveCompartment;
            default :
                return naiveCompartment;
        }
    }
}