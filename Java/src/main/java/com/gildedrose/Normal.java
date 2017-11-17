package com.gildedrose;

public class Normal extends Quality {

    @Override
    public void update(Item item) {
        decreaseQuality(item);

        updateSellIn(item);
    }

    @Override
    protected void expires(Item item) {
        decreaseQuality(item);
    }

    @Override
    public boolean applies(Item item) {
        return true;
    }
}
