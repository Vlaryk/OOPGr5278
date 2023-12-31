import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new OrdinaryClient("masha");
        Actor client3 = new SpecialClient("prezident", 1);
        Actor client4 = new SpecialClient("kirkorov", 2);
        iActorBehaviour client5 = new TaxInspector();
        iActorBehaviour client6 = new TaxInspector();
        iActorBehaviour client7 = new PromotionalClient(1234,"Alexandr");
        iActorBehaviour client8 = new PromotionalClient(2234,"Dmitriy");
        iActorBehaviour client9 = new PromotionalClient(3234,"Anna");

        magnit.acceptToMarket(client1, true);
        magnit.acceptToMarket(client2,false);
        magnit.acceptToMarket(client3,true);
        magnit.acceptToMarket(client4,false);
        magnit.acceptToMarket(client5,true);
        magnit.acceptToMarket(client6,false);
        magnit.acceptToMarket(client7,true);
        magnit.acceptToMarket(client8,false);


        magnit.update();
        System.out.println("\nКоличество участников акции: " + PromotionalClient.getTotalParticipants());
    }
}
