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

    public double calculateMarkup() {
        return salePrice - boughtPrice;
    }

    public String getType() {
        return type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
