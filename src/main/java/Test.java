import org.rosi.irigon.router.*;

import scroll.internal.Compartment.Player;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        AbstractRouter router = new ActiveRouter();
        CompartmentSwitcher ca = new CompartmentSwitcher();

        System.out.println(router.route("bla"));

        for (String current_ctxt : Arrays.asList("scheduled_ctxt", "predictive_ctxt", "naive_ctxt")){
            AbstractCompartment routerCompartment = ca.activate(router, current_ctxt);
            Player<AbstractRouter> adaptedRouter = routerCompartment.adapt(router, current_ctxt);
            System.out.println(routerCompartment.route(adaptedRouter, current_ctxt));
        }
    }
}