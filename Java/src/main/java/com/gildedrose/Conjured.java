package com.gildedrose;

public class Conjured extends Quality {

    @Override
    public void update(Item item) {
        decreaseQuality(item);
        decreaseQuality(item);
        updateSellIn(item);
    }

    @Override
    protected void expires(Item item) {
        decreaseQuality(item);
    }

    @Override
    public boolean applies(Item item) {
        return "Conjured".equals(item.name);
    }
}
