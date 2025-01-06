public class OnlineShoppingMain {
    public static void main(String[] args) {
        InventorySystem ivs = new InventorySystem();
        PaymentSystem ps = new PaymentSystem();
        ShippingSystem ss = new ShippingSystem();
        OnlineShoppingFacade osf = new OnlineShoppingFacade(ps, ivs , ss);

        osf.placeOrder();

    }

}
