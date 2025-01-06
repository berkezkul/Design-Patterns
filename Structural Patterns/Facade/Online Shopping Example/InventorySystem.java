public class InventorySystem {

    boolean isChecked = true;
    public boolean checkStock(String productID){
        if(isChecked){
            System.out.println("Check product " + productID);
            return true;
        }else{
            return false;
        }
    }
}
