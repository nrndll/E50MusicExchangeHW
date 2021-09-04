package shopItems;

public abstract class ShopItem implements ISell {

    private String type;
    private double boughtPrice;
    private double salePrice;

    public ShopItem(String type, double boughtPrice, double salePrice) {
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.salePrice = salePrice;
    }
}
