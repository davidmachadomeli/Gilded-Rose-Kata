package com.gildedrose;

public abstract class Quality {
    abstract void update(Item item);

    protected void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            expires(item);
        }
    }

    protected void increaseQuality(Item item) {
        item.quality++;
        item.quality = Math.min(50, item.quality);
    }

    protected void decreaseQuality(Item item) {
        item.quality--;
        item.quality = Math.max(0, item.quality);
    }

    protected abstract void expires(Item item);

    public abstract boolean applies(Item item);
}
