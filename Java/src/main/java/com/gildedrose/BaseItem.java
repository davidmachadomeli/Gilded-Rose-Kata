package com.gildedrose;

/**
 * Created by sbertran on 3/11/17.
 */
public class BaseItem {

    protected Item item;

    public BaseItem(Item item) {
        this.item = item;
    }

    protected void updateQuality() {
        decreaseQuality(item);
    }

    protected void updateSellInOfItem() {
        item.sellIn = item.sellIn - 1;
        if(hasExpired()) {
            updateExpired();
        }
    }

    public void updateExpired() {
        this.updateQuality();
    }

    protected void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected boolean hasExpired() {
        return item.sellIn < 0;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
