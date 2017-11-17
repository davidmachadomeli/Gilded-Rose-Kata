package com.gildedrose;

class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items)
            updateQualityForOneItem(item);
    }

    private void updateQualityForOneItem(Item item) {
        updateQualityOfItem(item);
        updateSellInOfItem(item);

        if(this.hasExpired(item))
            updateQualityOfExpiredItem(item);
    }

    private void updateQualityOfItem(Item item) {
        Quality quality = new NormalQuality();
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                quality = new LegendaryQuality();
                break;
            case "Aged Brie":
                quality = new AgedBrieQuality();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                quality = new ConcertPassQuality();
                break;
        }
        quality.update(item);
    }

    private void updateQualityOfExpiredItem(Item expiredItem) {
        switch (expiredItem.name) {
            case "Sulfuras, Hand of Ragnaros":
                break;
            case "Aged Brie":
                increaseQuality(expiredItem);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                expiredItem.quality = 0;
                break;
            default:
                decreaseQuality(expiredItem);
                break;
        }
    }

    private void updateSellInOfItem(Item item) {
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                break;
            case "Aged Brie":
            case "Backstage passes to a TAFKAL80ETC concert":
            default:
                item.sellIn = item.sellIn - 1;
                break;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private boolean hasExpired(Item item) {
        return item.sellIn < 0;
    }

    @Override
    public String toString() {
        String str = "";
        for (Item i : this.items) {
            str += i.toString();
            str += "\n";
        }
        return str;
    }
}