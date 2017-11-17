package com.gildedrose;

public class Conjured extends Quality {

    @Override
    public void updateQuality(Item item) {
        decreaseQuality(item);
        decreaseQuality(item);
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
    public void updateSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    public boolean applies(Item item) {
        return "Conjured".equals(item.name);
    }
}
