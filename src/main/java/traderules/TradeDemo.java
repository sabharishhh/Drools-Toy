package traderules;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TradeDemo {
    public static void main(String args[]) {
        TradeRules trade = new TradeRules("COPX", 112, 10000, "SHORT");

        KieHelper kieHelper = new KieHelper();

        kieHelper.addResource(
            kieHelper.getResources()
                     .newClassPathResource("resources/traderules/trade-rules.drl"),
            ResourceType.DRL
        );

        KieSession kieSession = kieHelper.build().newKieSession();

        kieSession.insert(trade);
        kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Ticker: " + trade.getTicker());
        System.out.println("Quantity: " + trade.getQuantity());
        System.out.println("Type: " + trade.getType());
        System.out.println("Amount: $" + trade.getAmount());
    }
}
