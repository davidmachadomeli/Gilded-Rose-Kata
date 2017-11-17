package com.gildedrose;

public abstract class Quality {
    protected void increaseQuality(Item item) {
        item.quality++;
        item.quality = Math.min(50, item.quality);
    }

    protected void decreaseQuality(Item item) {
        item.quality--;
        item.quality = Math.max(0, item.quality);
    }

    public abstract boolean applies(Item item);

    public abstract void updateQuality(Item item);

    public abstract void updateSellIn(Item item);

    public abstract void updateExpired(Item item);

    public abstract boolean hasExpired(Item item);
}
