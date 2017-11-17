package com.gildedrose;

public class AgedBrie extends Quality {
    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
    }

    @Override
    public void updateExpired(Item item) {
        increaseQuality(item);
    }

    @Override
    public void updateSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    public boolean hasExpired(Item item) {
        return item.sellIn < 0;
    }

    @Override
    public boolean applies(Item item) {
        return "Aged Brie".equals(item.name);
    }
}
