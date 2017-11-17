package com.gildedrose;

public class AgedBrie extends Quality {
    @Override
    public void update(Item item) {
        increaseQuality(item);

        updateSellIn(item);
    }

    @Override
    protected void expires(Item item) {
        increaseQuality(item);
    }

    @Override
    public boolean applies(Item item) {
        return "Aged Brie".equals(item.name);
    }
}
