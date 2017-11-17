package com.gildedrose;

public class ConcertPassQuality extends Quality {
    private static final int PASS_SELL_IN_FIRST_LIMIT = 10;
    private static final int PASS_SELL_IN_SECOND_LIMIT = 5;

    @Override
    public void update(Item item) {
        increaseQuality(item);

        if (item.sellIn <= PASS_SELL_IN_FIRST_LIMIT)
            increaseQuality(item);

        if (item.sellIn <= PASS_SELL_IN_SECOND_LIMIT)
            increaseQuality(item);

        updateSellIn(item);

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
