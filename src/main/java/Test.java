import org.rosi.irigon.router.*;

import scroll.internal.Compartment.Player;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        AbstractRouter router = new ActiveRouter();

        //System.out.println(router.route("bla"));

        for (String current_ctxt : Arrays.asList("scheduled_ctxt", "predictive_ctxt", "naive_ctxt")){
            router.activate("message", current_ctxt);
            System.out.println(router.route("message"));
        }
    }
}