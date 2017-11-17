package com.gildedrose;

public class Normal extends Quality {

    @Override
    public void updateQuality(Item item) {
        decreaseQuality(item);
    }

    @Override
    public void updateSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    public void updateExpired(Item item) {
        decreaseQuality(item);
    }

    @Override
    public boolean hasExpired(Item item) {
        return item.sellIn < 0;
    }

    @Override
    public boolean applies(Item item) {
        return true;
    }
}
