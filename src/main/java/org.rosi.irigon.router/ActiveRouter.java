package org.rosi.irigon.router;

import scroll.internal.Compartment;
import scroll.internal.Compartment.Player;

public class ActiveRouter extends AbstractRouter {

    CompartmentSwitcher ca;
    AbstractCompartment routerCompartment;
    Player adaptedRouter;

    public ActiveRouter() {
        ca = new CompartmentSwitcher();
    }
    public void activate(String msg, String ctxt) {
        System.out.println("Calling activate with " + msg + " and context: " + ctxt);
        routerCompartment = ca.activate(this, ctxt);
        System.out.println("Compartment " + routerCompartment.toString() + " activated");
        adaptedRouter = routerCompartment.adapt(this, ctxt);
        System.out.println("AdaptedRouter == " + adaptedRouter.toString());
    }
    public String route(String msg) {
        return routerCompartment.route(adaptedRouter, msg);
    }
}