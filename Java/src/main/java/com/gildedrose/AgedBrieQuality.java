package com.gildedrose;

public class AgedBrieQuality extends Quality {
    @Override
    public void update(Item item) {
        increaseQuality(item);

        updateSellIn(item);

        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }

    @Override
    public boolean applies(Item item) {
        return "Aged Brie".equals(item.name);
    }
}
