package com.gildedrose;

public class ConcertPass extends Quality {
    private static final int PASS_SELL_IN_FIRST_LIMIT = 10;
    private static final int PASS_SELL_IN_SECOND_LIMIT = 5;

    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);

        if (item.sellIn <= PASS_SELL_IN_FIRST_LIMIT)
            increaseQuality(item);

        if (item.sellIn <= PASS_SELL_IN_SECOND_LIMIT)
            increaseQuality(item);
    }

    @Override
    public void updateExpired(Item item) {
        item.quality = 0;
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
        return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
    }
}
