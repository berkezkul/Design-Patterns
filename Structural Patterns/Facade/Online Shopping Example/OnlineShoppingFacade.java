public class OnlineShoppingFacade {
    PaymentSystem ps;
    InventorySystem  inv;
    ShippingSystem ss;

    public OnlineShoppingFacade(PaymentSystem ps, InventorySystem inv, ShippingSystem ss) {
        this.ps = ps;
        this.inv = inv;
        this.ss = ss;
    }

    public void placeOrder(){
        inv.checkStock("123457");
        ps.makePayment("berkezkl", 352.99);
        ss.shipProduct();
    }


}
