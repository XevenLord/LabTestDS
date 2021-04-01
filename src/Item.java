public class Item<a,b> {
    private a item;
    private b correspondingPrice;

    public a getItem() {
        return item;
    }

    public void setItem(a item) {
        this.item = item;
    }

    public b getCorrespondingPrice() {
        return correspondingPrice;
    }

    public void setCorrespondingPrice(b correspondingPrice) {
        this.correspondingPrice = correspondingPrice;
    }
}
