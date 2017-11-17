package com.gildedrose;

public abstract class Quality {
    abstract void update(Item item);

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

    protected void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    public abstract boolean applies(Item item);
}
